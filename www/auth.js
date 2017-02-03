/*global cordova, module*/

module.exports = {
    auth: function (options, successCallback, errorCallback) {
      
      if(typeof options.user !== 'undefined') throw new Error('user field is not defined.');   
      if(typeof options.password !== 'undefined') throw new Error('password field is not defined.');   

      cordova.exec(successCallback, errorCallback, "Authenticator", "authenticate", options);
    }
};
