�}�e  Y3  e!=�K4��e��� �`G�<����mUk]�N�j�S�v���4���pa�oί"��0?� ���O������}��K`QX�v]*�� ����9���d�"o�*�"�L�y��1��b�ҡ]n&��}��Qc��B���bY���,�R�i)c�o#9���Ы��;,�����k�iB�2i��Z�7^�7=��Q�Kڴ)4�b�!�ѧ��h��՛䦮�^߸G+� Rߣ1#��/�����goS�i�A��edC���m~T��!lƿ�Kz�B09Y�o�|}�,y�$VIe�����b�<y%V��0�����!�uX�����NrǑ$��|#H�	zϒ 6�2,���Y�	r��<g��4�����Z�j�;���[z����V��T�c����wV���[%j�ߥE�"ژi�c�~z��яU�	X��u����.�,�WCdZ|���v���N�i�	ks8�E�+����_��� ��!����lD*|`�2���3�o�4�&�cb��= T?[��Srn������b��t.n+��]t�_���h�T�"b��M�OsN\��"���ִ��><bo/�y�j����ʪO8&�r!'W�"�B�G
�鳱X9��(�����}�oNA\@�o����a"�e�ճ�߇�,u��;�bܢ~8^MW���հ�����Z��h髂{�$#�P�LJ7�Z-�N�Ɲ�=�~�/ia���UOV+G"�A�;S������� b] &���93���uP���<X�grV"W*J��YR�?o84�X)��]��&KO�M�\? ga�Y��;�^�����'3[��WJa�Z�daM�SyKn�y�
�]܂7(��҉>�-e2xG@�9.A�w�j������J�@*:{��F�h�E�0�jqR(/����}�r����:���⾒�t���:�P:��=>GS�<���[!d٭�c������](v]��pRx��Հ���g@��"/0op
    var basicLoop = function() {
      basicBar.reach(undefined, {
        complete: percentageLoop
      });
    }

    var percentageLoop = function() {
      percentageBar.reach(undefined, {
        complete: stepLoop
      });
    }

    var stepLoop = function() {
      stepBar.reach(undefined, {
        complete: basicLoop
      });
    }

    // start
    basicLoop();
  });