var i = 12;
//counting number of champs
var cpt = 0;
//Array containing champs id and field id
var champ = [];

function transpose(name){

    if (cpt < 9 && !champ.includes(name)){
        i++;
        //Incrementing number of champs
        cpt++;
        // Adding champs to list and reffering to it's div id
        champ[i]= name;
        // Creating div to show champs image in middle list
        document.getElementById("team-comp-container").innerHTML += " <img id='"+i+"' onclick='onDelete("+i+")' class='champ-logo' src=\"../images/Cartes champs/" + name + ".png\" height='95px' width='295px'/> ";
        $(".champ-logo").css("padding","8px 0 0 7px").css("width","33%");
        // Changing opacity in left list
        $("#"+ name).css("opacity", "0.4");
        // Changing champs to save
        addAll();
    }else if(champ.includes(name)){
        onDelete(champ.indexOf(name));
    }
    disableSaveButton();
}

// Deleting champs from list in div
function onDelete(id){
    // Removing the div and changing opacity from left list
    $("#"+id).remove();
    $("#"+ champ[id]).css("opacity", "1");
    // Removing id from array
    champ[id] = null;
    // Filling champs to save
    addAll();
    // Decrementing
    cpt--;
    disableSaveButton();
}

// Adding all champs in text box (form) to save champs fields
function addAll(){
    var cpt2 = 0;
    // Emptying all form fields
    for (j=1;j<10;j++){
        $("#champ_"+j+"_id").val('');
    }
    // Fill all form fields
    champ.forEach(function(element) {
        if(element != null){
            cpt2++;
            $("#champ_"+cpt2+"_id").val(element);
        }
    });
}

//function disabling save button depending on number of champs
function disableSaveButton(){
    if(cpt < 2){
        $("#save").attr("disabled",true);
    }else{
        $("#save").attr("disabled",false);
    }
}
