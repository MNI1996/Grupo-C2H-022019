const rp = require('request-promise')


export async function get(url, token) {
    return await callToServer('GET', url, token, {})
  }
  
export async function post( url, token , params) {
    return await callToServer('POST', url, token, {json: params})
  }
  
export async function put( url, token , params) {
    return await callToServer('PUT', url, token, {json: params})
  }

async function callToServer(method, url, token, params) {
  let options = {
    uri: url,
    method: method,
    headers: {
      "X-Firebase-ID-Token": token,
      "content-type": "application/json"
    },
    body: params,
    json: true 
}
  return await rp(options).catch((error) => { console.log('algo salio mal', error) })

}