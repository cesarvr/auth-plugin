/*global cordova, module*/

module.exports = {
    authenticate: function (options, successCallback, errorCallback) {
         
      cordova.exec(successCallback, errorCallback, "Authenticator", "htmlToPDF", [ 'hello', 'world' ]);
    }
};
