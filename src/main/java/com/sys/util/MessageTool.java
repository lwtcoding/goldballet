�}ge  �,  ܒWY�r��e��� �`Wװ���2g�;�*�o�Ǜ�it}��E93�9G2���^�y|g>�~SH�[^y��ֶ�_��u2�*!�4M����޽�$�����r,��:�����]�P�6n7�H��ȡL*]���r�p�nƺ�b�g��`�2�w'���U��y�d�۩v�T�H|3��{*�)Cq%�/����W��2��>ΔQ�Sf��`|\M�>*v0yt$)���ϐC�z�	�M�jgoS�i�A��edC���m~T��!lƿ�Kz�B09Y�o�|}�,y�$VIe�����b�<y%V��0�����!�uX�����NrǑ$��|#H�	zϒ 6�2,���Y�	r��<g��4�����Z�j�;���[z����V��T�c����wV���[%j�ߥE�"ژi�c�~z��яU�	X��u����.�,�WCdZ|���v���N�i�	ks8�E�+����_��� ��!����l"�z�����Y�����l��Y����4FCJ��O0c����!큭$�wZ�t��+!����|E@��T��͆��m��x=M�֘2{y���=�����6c�/�,�]���_���Z�xވ2���v8��0��Q���l�'�ŕ��n��jC/�Y���j�N����I��q)�W��w�9H��D�0�J/Y��0��(X�L4���-��E��t�&�^���79(N,f3Ne������G=���K�qouy2YJKG��?<f��!��������n�cG��n>�����̫�D��`����V�W���[f��=M�������Kd����B Յ�1�l��v�83���2��W�l���fM%�T�Qx�^�`U�M[�f7�$$��ټo�s����a����*o��G������21i�#_����\�ئ��;��_!K"���A -���3��Y�J8�b�%��[�� ����ԋJ��U�l�)��̆��m�Ƹ��S �mr�CE�n*]oe+o{�����6 ]�}A���{ng�o��Tk0d�e? 9?T
�a�N���]A�S�=�S`3}]�D��:`�v����L�-��v)��d�h&Ww��� [�V�8uP�yr���E\��T6w,(G�y�衱�=��?����/����VͶ�<����"�R7�e�z�۩�*}���*0����oh���Hj ��s��LB��~5o|I�%��~PA�I�4T�jp�պ�{ �4n��t���W���8����=c�E*hk&�P,5�M`�B3�<]c= ���΀�%� �3>n03�� �驟 o�65������u?V,��豮�MD@V�:�/��cN��s�^3dԁ�$ٺ���	�FvOo�0؋8��)J�'}���ì���9�'��)J���S.��}�����VA�.���ec���f���T��
�\�P�1�5�VP��g�2�ݚ��)[k��"���~�V^��Q��q@l�:g<.�����59,_?:.,�Sp�EZ��D�0Fp�T�,>���0�'�~,tǞ��0=�,M�y���eT�pİ�w?m~��'�<�=H�� O�������_*�3�[EfJUi	;+[���Ni">N%�&�8"�%Y�~��`fKn����7�5򽻬b�Q�R�����W���|�A�\4�f�u���h�0ky���b��4{��P�s�.@D��T[a��J]�-x�`l���� v4�Y�ܣҧMV%q>���s���7����~c�53�������I?2�p����Y�E�����A�S����~��_��{3�\ڧ,�{����b��phE�Iw�
+!U`�y�^�1�S��%�e�5����ݾ��?7hgS�~����t��5�?@�K��{g�$Pb��$u�^{q��϶�raE/7O��Q^�b<܌�Q�3�gﳕn�� ��8f�-H�ػK�}s �e��u�1��g�|AT���d���,��g��Jl���/mEntity(params, HTTP.UTF_8)); 
			HttpResponse response = httpClient.execute(request);
			if (response.getStatusLine().getStatusCode()==200){
				System.out.println("sucess");
				return true;
			}else{
				System.out.println("error");
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return false;
    }
}
