�}e  B%  ��F���e��<�`_�N(n�̱{r�N�n���	���d�<օ����d�:�޲Q�o5�U �� WHVd��֞X�F��GO������̧Qzs�(�G��U�����]�p[�hį�	�Qs@ȇR�'����{8g��-!���_O�zւE��w��#�������zlE���i��Ԇ]x�{+�)���QL���T��SD	�G�8�R�KDK�멷ڋ�k$y�gj�Cq��x�����+�xK���������~h�!!� �+mN�;��X���7!����b}�A]g�0��BO���bc4���K3��U^j)/rǑ$��|#H�	zϒ 6�2,���Y�	r��<g��4�����Z�j�;���[z����V��T�c����wV���[%j�ߥE�"ژi�c�~z��яU�	X��u����.�,�WCdZ|���v���N�i�	ks8�E�+����_��� ��!����lD��=�:��;d���g�𶱉��N�B�6�p$�Z�j�t:��^�=�k�#ж�t��[�,P�_?Y�h�֧��t:�N���cR ��N>!y��(j�C��,�A���H��M��^[��Yp�?zz֐{1��B��b����D�3��Z3=���+�
���?�i����+1f�!�x˘�
�Q�Ǔ]��PZrk��j!_*�&g�W7��mխX�h�!>��'a*<+�������~<��чn\J}L�!�����=KN����.�ˈ�Su� O�FS��"Fd(�qs�W����٘����=g��Qهa:Ov�(�[v/�Z��0��'Ƨo�r؀p�6������	⵬�-��'z��g��-�Ym�}��c�"��ꄝ�4�W|W����D�A��Ur$�����W	#l9i�V&�ȶ�i��3�#�_y�E2p\�-Dglji����V������A�}�ٗ.�$c�9l�W}�0r{��G�"��v���wb�/SM>lave");
			DataSourceSwitcher.setSlave();
			System.out.println("slave");
		}
	}

	// service方法执行完之后被调用
	public void afterReturning(Object arg0, Method method, Object[] args, Object target) throws Throwable {
	}

	// 抛出Exception之后被调用
	public void afterThrowing(Method method, Object[] args, Object target, Exception ex) throws Throwable {
		//System.out.println("出现异常,切换到:slave");
		DataSourceSwitcher.setSlave();
	}
}
