import { confirmable, createConfirmation, type ConfirmDialogProps } from 'react-confirm';

const MyDialog = ({ show, proceed, message }: ConfirmDialogProps<{ message: string }, boolean>) => (
  <div className={`dialog-overlay ${show ? 'show' : 'hide'}`}>
    <div className="dialog">
      <p>{message}</p>
      <button onClick={() => proceed(true)}>Yes</button>
      <button onClick={() => proceed(false)}>No</button>
    </div>
  </div>
);

export const confirm = createConfirmation(confirmable(MyDialog));