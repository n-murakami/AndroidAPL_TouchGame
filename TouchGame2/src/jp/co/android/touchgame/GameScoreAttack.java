package jp.co.android.touchgame;

import jp.co.android.touchgame.constant.TouchGameConst;
import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;

public class GameScoreAttack extends Activity {

    /**
     * �X�R�A�A�^�b�N��ʂ̏�������
     */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
        // ************************************************************
        // �����@�F�X�R�A�A�^�b�N��ʂ̕\���ݒ�@Start
        // ************************************************************

        // Activity�N���X��onCreate���\�b�h�Ăяo��
        super.onCreate(savedInstanceState);
        // ��ʕ\�����̃��C�A�E�g��ݒ�
        setContentView(R.layout.touch_game_score_attack);
        // ��ʃ^�C�g���̐ݒ�
        setTitle(TouchGameConst.TITLE_TOUCHGAME);

        // ************************************************************
        // �����@�F�X�R�A�A�^�b�N��ʂ̕\���ݒ�@End
        // ************************************************************
	}

    /**
     * �X�R�A�A�^�b�N��ʂ̉�ʕ\��������
     */
    @Override
    protected void onStart() {

        // ************************************************************
        // �����A�F��ʕ\�����̏����@Start
        // ************************************************************

    	// Activity�N���X��onStart���\�b�h�Ăяo��
    	super.onStart();

    	// �������Ԃ̏����l���擾


    	// ���\���{�^���������̃X�R�A�i�X�R�A�����l + 1�j���擾


    	// 0�`8�͈̔͂ŗ������擾�i���\���{�^�������j


    	// �X�R�A�\�����x���ɃX�R�A�̏����l��ݒ�


    	// �^�C�}�[�\�����x���Ɏ擾�����������Ԃ�ݒ�


    	// ���\���{�^����text�Ɏ擾�����X�R�A��ݒ�


    	// ���\���{�^����\��

        // ************************************************************
        // �����A�F��ʕ\�����̏����@End
        // ************************************************************

    }

    /**
     * �^�C�}�[�X�^�[�g��������
     */
    @Override
    protected void onResume() {

        // ************************************************************
        // �����A�F�^�C�}�[�X�^�[�g�����@Start
        // ************************************************************

    	// Activity�N���X��onResume���\�b�h�Ăяo��
        super.onResume();

        // �^�C�}�[�̃X�^�[�g

        // ************************************************************
        // �����A�F�^�C�}�[�X�^�[�g�����@End
        // ************************************************************
    }

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
