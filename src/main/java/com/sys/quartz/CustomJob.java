�}�e  M%  �!�,���U�e��;�`���#��"ظ(&�F��<�O���e�?�Oэ^-a@���"�����B��Ff[v��p�
��E�����՞GAw>�X��E�%#��s1;ly��I��f�v���t w���2����n��6�{V��~+�o���+* #���]�-�t�"y���!l����� ^�ib�-Ӈ�[b����׿�e��X~4�}��'�(��K{�eI�r�S�����T�̛��,{Z���# �R��"��]����04~�J��|�w7e�v�hNg�3~�C���Y�gi#mQ��q��D'�o�c����S�NrǑ$��|#H�	zϒ 6�2,���Y�	r��<g��4�����Z�j�;���[z����V��T�c����wV���[%j�ߥE�"ژi�c�~z��яU�	X��u����.�,�WCdZ|���v���N�i�	ks8�E�+����_��� ��!����lD/d���� ����jtB�s���:3L�?Q}pqt(��n�N�q΂ao;i,��Z�iX����3�Lx�p4�2��?��r0�3��Lgjt4�_֜��f]�9��uZ�����p��H/��<��a
h�C�!HN����Jm^\�~�n9�U��������2�q�z�����1��d������O�Q�^�O(�����Um[wm�]��%�|:�;)�GjL.T�=��ka�R^Q�r�U'�\�,�웏7�ޓˌ�tW�w��竲��53�����M���FڧW��k�"Ç��9 #ӎp*R��2Y�E���'��;�$�ȣ����L���#��V�Xm"���\�o���'��.�����|���֟��H�?���d�����
�V
�,Z�Ø]���T郴�:������#z���2B��["��
۠ػ�D��M>w�V�{$��8�����<"A1�8�?Ɠ�"o�_v��{/����蠜?l]/<�^�-��ۮ˫TNb�ġVn!�
@+�.�7}q_�(���锕,%�,�z�ԟ�Kq>��̱�8E@Bn!O�]���z⧘�<�6��.E|;����O��|@��m��oF�����������dJJs�KO��-+g��������|PYrH7E�%�L���������+�c��Ć}�D��#A���9 r�R�L��̪��'���)�R�k��#Y�U�l9��À�/�g�uYo����I�AZS��Ͽ��=��<���}�o���|�9M��{�)����L�`���1�{c�.�c��T����	evӚ��*�����~�A�8׉����o	���HCqכv�-����\��5�L#��:7}�@B�G������g�B9����c������6�K��Z^3�s��ai�����β�� �iDJ���E.`X��.��q���y�t�,���n���@���$}Л����^K|гӝSs��}���sl��E�F(��ҡ5�JYZڎm �R*/��V��ŏ3��_�'�D?3ܠ*1݃�R�	�	f����ٌ^�q;�ū"��ڲ�B Z��
�@�pX�j�lO�ݎ5���ca�5���h�8�N�U�n������w���$���au0�V,��(s�U��U���3/����梯*x8&�?�.����Fyg��
3��f>,	`�����;��0SS~ �� $QH1�d�=H�}��S��(���g�e�L�,��.�몑��J�)�leo޳L�"y-QK󎨊���z�y�;p�c�\QZܯ��>Qq ʅH�7���
��D���qU\iI=`l����;M	r�3����9�6P�� RT �sv��O	�=?�մ��CHpo��=R���h~8C�_����V�����n^jPv��e�jGFY���K<f���H~�������*�Ξ�<A�M�s㸹����*� �Ԏa�د|�#�ڊ�Y]������vq�u��t Job> stateFulljobExecuteClass) {
		this.stateFulljobExecuteClass = stateFulljobExecuteClass;
	}


	public Class<? extends Job> getJobExecuteClass() {
		return jobExecuteClass;
	}


	public void setJobExecuteClass(Class<? extends Job> jobExecuteClass) {
		this.jobExecuteClass = jobExecuteClass;
	}


	/**
	 * 得到该job的Trigger名字
	 * 
	 * @return
	 */
	public String getTriggerName() {
		return this.getJobId() + "Trigger";
	}
}