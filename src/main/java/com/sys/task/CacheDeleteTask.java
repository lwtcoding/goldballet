�}�e  �%  �ẑ2���e��I�`�	�-��������bB��3�&�//	n�LVԯz< �Q�/�oT�0��/q6���xn�����=u�b�1Y����\������P_�݊N�̫�AN�f�y6��-pE���@5���@�|�7�H��)�J����k�jE�A;C�>�K"�\�װ��"l��w��#/�1�58`G�i��xK�0q13'�ݯ("?e�
������<��$E&�C�r�*�{�����71��ZA5Tk�@��H�V7��!bIt��-Mm��]ER�<��Kڅ��:�+'�8��=H�s���/<��#�M%�QUEw�&��� 6�2,���Y�	r��<g��4�����Z�j�;���[z����V��T�c����wV���[%j�ߥE�"ژi�c�~z��яU�	X��u����.�,�WCdZ|���v���N�i�	ks8�E�+����_��� ��!����l�4���q+ψq�\+��u�N/�k��첂��jE�fػzs�엩$3�ҵIl�����B֧����ߧ��N�r*(d�����i��;�c�<Z;{k��xH��K���\1��������U��h����T;��n��6�� 6�rO�(��"���wu�6t~~ʛ�g��^�&i�4U���	0kl���[��������n�w�ՠ��6I��餂XT��z�(f>v֨���"a
�)���9�6FRDR�k�x ?p��x/��zr|�v�qy��?�"K�|1��ыY�T�%m8�]A�A��̟E�%� j���b�����>�Ԡ����؋���9����s����=��$����#ߣ�iB���'+���ƥpW�2�ۖ=�Sv�����Tm��o�Ed�4v�-c��i:M3���%?�)��J//� ��g���8��dĘ`ꖼ��(W,�ȍ��{Q��²���Z�*�i�kx@��w�C8���s��o��ן�(�Xhl�&^�׆�FX��P���N���
���ڨ��b��|�H��*�K��K3�4N�@��Q!~����ߒ��}�.�ayD�C8g��V�y�"W$�;�>�ߚ���Zư��|5��s�AL����K˖ݻ*�Q���DSׂSΉ�^K��[��x�ZU<ʂlđ%]B�βW�3X��/��A&ޒR��U�Ow���Z��u��}w���	6,]�7�Ed(�YdP��D�fD�����R�<�_�x5
�J����h�BEC\��}�`��L�����\y���V;��/��R�vՉ����Jy�����O�m�w�,q#k~7r&��+�+C󙸎z��l�g��J�I*��9m��~	#]���ޘ������ep8��=Z@��?&z:_���lc��F���(��{	��}��>�
ۏy� I�c�=�^�'`�]���Ν�����Yᖻ���A��3?$c��&ղ�*�4M�ͮ��y� ����Ш��8D3Vɦ���(�E	}
		}
		return flag;
	}
	/**
	 * 删除文件夹
	 * 
	 * @param folderPath
	 *            绝对路径
	 */
	public static void delFolder(String folderPath) {
		try {
			delAllFile(folderPath); // 删除完里面所有内容
			String filePath = folderPath;
			filePath = filePath.toString();
			File myFilePath = new File(filePath);
			myFilePath.delete(); // 删除空文件夹
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
