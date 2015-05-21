<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script> 
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script> 



<div class="bs-example"> 
    <!-- Button HTML (to Trigger Modal) --> 
    <a href="#myModal" class="btn btn-lg btn-primary" data-toggle="modal">Reportar Problema</a> 
     
    <!-- Modal HTML --> 
    <div id="myModal" class="modal fade" aria-hidden="true" style="display: none;"> 
        <div class="modal-dialog"> 
            <div class="modal-content"> 
                <div class="modal-header"> 
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button> 
                    <h4 class="modal-title">Confirmation</h4> 
                </div> 
                <div class="modal-body"> 
                    <p>Ingrese su error a reportar:</p> 
<form method="POST" action=""> 
                    <textarea name="Error" cols="40" rows="5"> </textarea> 

                    <p class="text-warning"><small>If you don't save, your changes will be lost.</small></p> 
                </form></div> 
                <div class="modal-footer"> 
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button> 
                    <button type="button" class="btn btn-primary">Save changes</button> 

                </div> 
            </div> 
        </div> 
    </div> 
</div>