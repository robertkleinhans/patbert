var first_click = "";
var second_click = "";
document.onkeydown = fkey;
document.onkeypress = fkey
document.onkeyup = fkey;

var wasPressed = false;

var uri = "ws://localhost:9000/socket";
var websocket;


function create_field() {
    var field_header = "<table align=\"center\" style=\"background-color:#000000\">";
    document.write(field_header);
    build_legend();
    for(var i = 1; i < 9; i++) {
        build_main(i);
    }
	document.write("</table>");
    setUp_figures("black");
    setUp_figures("white");
}

function build_legend() {
    var legend_top = "<tr style=\"background-color:white\">";
    document.write(legend_top);
    for(var i = 0; i < 9; i++) {
        var tmp;
        if(i > 0) {
            tmp = "<td align=\"center\">" + String.fromCharCode(64 + i) + "</td>";
        } else {
            tmp = "<td align=\"center\"></td>";
        }
        document.write(tmp);
    }
    document.write("</tr>");
}

function build_main(row) {
    var tmp = "<tr><td valign=\"middle\" align=\"center\" style=\"background-color:white\" width=\"15px\" >" + row + "</td>";
    document.write(tmp);
    for(var i = 0; i < 8; i++) {
        tmp = "<td id=\"" + (row*100+i*10) + "\" onclick=\"on_click(this.id)\" ><div class=\"";
        if((i+row)%2 === 0) {
            tmp += "black_field";
        } else {
            tmp += "white_field";
        }
        
        tmp += "\"><div class=\"zentriert\">";
        tmp += "<img src=\"//:0\" id=\"" + (row*10+i) + "\"  opacity=\"1\"/>";
        tmp += "</div></div></td>";
        document.write(tmp);
    }
    document.write("</tr>");
	document.write("<div id=\"track\"></div>");
}

function allowDrop(ev) {
    ev.preventDefault();
}

function drag(ev) {
    ev.dataTransfer.setData("text", ev.target.id);
}

function drop(ev) {
    ev.preventDefault();
    var data = ev.dataTransfer.getData("text");
    ev.target.appendChild(document.getElementById(data));
}

function clear_click() {
    first_click = "";
    second_click = "";
}

function convertToMsg(start,to) {
	var tmp = "" + start + "-" + to;
	return tmp;
}

function on_click(id) {
    if (first_click === "") {
        first_click = id;
    } else if (second_click === "") {
        second_click = id;
        //moveFigure(first_click,second_click);
		sendMessage(convertToMsg(first_click,second_click));
        clear_click();
    }
}


function moveFigure(start, to) {	
    var elem = document.getElementById(start/10);
    var elem_to = document.getElementById(to/10);
    elem_to.src = elem.src;
    elem_to.style.display="inline-block";
    elem.src = "//:0";
    elem.style.display="none";
}

function setUp_figures(color) {
    var add;
    if (color == "black") {
        add = 10;
    } else {
        add = 80;
    }
    var pre = "assets/images/";
    for(var i = 0; i < 8; i++) {
        var pos = add + i;
        var elem = document.getElementById(pos);
        
        if(i === 0 || i == 7) {
            elem.src = pre + color + "_RO.png";
        } else if (i == 1 || i == 6) {
            elem.src = pre + color + "_KN.png";
        } else if (i == 2 || i == 5) {
            elem.src = pre + color + "_BI.png";
        } else if (i == 3) {
            elem.src = pre + color + "_QU.png";
        } else {
            elem.src = pre + color + "_KI.png";
        }
    }
    for(i = 0; i < 8; i++) {
        var t_pos = 0;
        if(color == "black") {
            t_pos = add + 10 + i;
        } else {
            t_pos = add - 10 + i;
        }
        
        var p_elem = document.getElementById(t_pos);
        p_elem.src = pre + color + "_PA.png";
    }
}


function ws_test() {
	websocket = new WebSocket(uri);
	websocket.onopen = function() { onOpen };
	websocket.onclose = function() { onClose };
	websocket.onmessage = function(evt) { onMessage(evt) };
	//$.get('/socket');
}

function onOpen() {
	//pass
}

function onClose() {
	//pass
}

function onMessage(evt) {
	if(evt.data === "WON_P") {
		alert("Game over, you won.");
		window.location.reload();
	} else if (evt.data === "WON_B") {
		alert("WHAT A DISGRACE! YOU LOST!");
		window.location.reload();
	} else {
				
		var tmp = evt.data.split("-");

		moveFigure(parseInt(tmp[0]),parseInt(tmp[1]));
	}


}

function sendMessage(message) {
	
	if(websocket.readyState == 1) {
		websocket.send(message);
	} else {
		setTimeout(function () {
		websocket.send(message);
		}, 500);
	}
	
	//
}
create_field();
ws_test();



function fkey(e){
        e = e || window.event;
       if( wasPressed ) return; 

        if (e.keyCode == 116) {
            sendMessage("refresh");
            wasPressed = true;
        }
 }



