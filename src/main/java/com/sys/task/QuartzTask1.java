�};e  S%  �k�XX���e��3�`W�N,��̱�T�Cڰ�()�!1Ot�TH?=���O�qgꈮ��YԱ��t����xeG��-�_2�e�u%���|D}�q�¯�R�P�c����om�I"�E8m��<oCv�X	��Fa%�r�r�����ڗ��� ��p�4 s
׌��Xi���Wkdv[�`a#砀���q0t�p��Rh��- ���d���A�O��`�	,%��Ŭ����=R' ��� �N���~g�$2�%�}��Oף����_����(��(a��x;�v�����c��}͉[�	YQg꤅]s���pH�Bc�����uX�����NrǑ$��|#H�	zϒ 6�2,���Y�	r��<g��4�����Z�j�;���[z����V��T�c����wV���[%j�ߥE�"ژi�c�~z��яU�	X��u����.�,�WCdZ|���v���N�i�	ks8�E�+����_��� ��!���� JobDataMap parameters= context.getMergedJobDataMap();
   SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");
   System.out.println(format.format(new Date()));
   System.out.println(parameters.get("gg"));
   count++;
   if(count>3){//限制使用次数
	   System.out.println("任务正在关闭...");
	   QuartzManager.deleteScheduleJob("autoRun","autoRun_group");
   }
  //在这里执行你的任务...
  } catch (Exception e) {
  e.printStackTrace();
 }
}
}