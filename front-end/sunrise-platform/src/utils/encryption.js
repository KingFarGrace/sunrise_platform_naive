import {JSEncrypt} from 'jsencrypt/bin/jsencrypt';

export function encrypt(data, publicKey) {
  const jse = new JSEncrypt();
  jse.setPublicKey(publicKey);
  return jse.encrypt(data);
}
