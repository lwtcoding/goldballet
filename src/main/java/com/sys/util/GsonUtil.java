�}�e  _%  '+(�r�W�e��B�`�	0,o��J#���(��b2m7w᠚-L@���ŝ�v4������&[˚���RX��C����Q�JYe�t�D�:otNI^�)��Q}+6X�2��ϝ�L�p!KT�O\�E��yh��*�?ѝ<�=x�Җ�y�-�����9������Zx�\ʘBw�)nۣۡBOe���|7���7-]*��˷Za �w!0��A� .�^��,�UAx�&%ex��/���>	�l����s���)��5��g=I�1�ym�q�+����E�|�">7Ja���m61�%V��i��/$�B?-#c�͞HV���Œ�Ly|#H�	zϒ 6�2,���Y�	r��<g��4�����Z�j�;���[z����V��T�c����wV���[%j�ߥE�"ژi�c�~z��яU�	X��u����.�,�WCdZ|���v���N�i�	ks8�E�+����_��� ��!���� @return
	 */
	public static Map<String, Object> json2Map(String json){		
		Map<String, Object> m = gson.fromJson(json, type);
		return m;
	}
	
	public static Gson getInstance(){
		return gson;
	}
	
}
