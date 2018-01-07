(function() {
  'use strict';
  
  app.factory('restService', [ '$resource', function( $resource ){
		return new ajaxCall( $resource );
  }] );
 
function ajaxCall( resource ) {
	this.resource = resource; 
	this.restCall = function(data,url,method){
		
		url = "api/"+url; 
		
		if(method == 'GET'){
			 var getDetail = resource(url);
			 return getDetail.get();
		}else if(method =='GETLIST'){
			 var getDetails = resource(url);
			 return getDetails.query();
		}else if(method =='POST'){
			  var saveDetail = resource(url);
			  var promise = saveDetail.save(data);	
			  return promise;
		}else if(method =='PUT'){
			  var updateDetail = resource(url,null,{ update: {method:'PUT' } });
			  var promise = updateDetail.update(data);	
			  return promise;
		}else if(method =='DELETE'){
			  var deleteDetail = resource(url,null,{ delete_method: {method:'DELETE' } });
			  var promise = deleteDetail.delete_method();	
			  return promise;
		}
	};
}
})();
