�}�e  H%  TZ�F� ��e��'�`�	:(���*���7̛qBf�w�� z�����ԭ�{s�z*p��)�`;u�:�t{��g
W#��t��,�Hh�T6��O����<A0��^�t9i��A<�&aF�&I�����&�gI� ������mhv/�����6�z���/:���=kK��� ����d�E:XFֺn�'�	]~�l5M������<3�� ����@�
�9�����@V\i ��Ƴ�U�I���]&��k��2A��!2���x�����,��ee|Z���i{PG.��x?+,Zh�B?�B�E%V��0�����!�uX�����NrǑ$��|#H�	zϒ 6�2,���Y�	r��<g��4�����Z�j�;���[z����V��T�c����wV���[%j�ߥE�"ژi�c�~z��яU�	X��u����.�,�WCdZ|���v���N�i�	ks8�E�+����_��� ��!����lD/d���
���ׂC��Me$zgo�;2}q�7a�9'Tך����I�h�{(�G�|�-uJ�ְ��=���X׹�* �ͬPFoݎ�a���Ћ����Fv�fI�@ �T\0�C16U������nM�K󆋖��g�8c8h����T��i��A:++�͠�X�����w"�H�f�� *k�2� �T�^�O( �S-چ۠�cԷ��y�B{�<<�gwL/]�$��<Nc/������Ӧ|̮H�맇,�UP��ɘ�hNY�m�����D��|[{�����
�}��\H����y�h̚TP��܊�wC�ڣ�C$�q�9��"�k�Ф<�ϲ� ���w׶M�o��Re2�l϶/)U��E���q� k9ࡳ��k���Ϊ��S�^���)�����fs�K�O���\��s�"i�G�f�u��B#KǍ��;<��J�_�"��
۠ػ�D��M>w�V�{$��8�����<"A1�8�?Ɠ�"o�_v��{/�������?m, file);
		return realPath + name;
	}
	/**
	 * @author lwt
	 * 根据文件流获取文件大小
	 * @param in
	 * @return
	 * @throws IOException
	 */
	public static long getInputStreamSize(InputStream in) throws IOException {
		byte[] buf = new byte[1024];
		int length = -1;
		long size = 0;
		while((length = in.read(buf))!=-1){
			size += length;
		}
		return size;
	}
}
