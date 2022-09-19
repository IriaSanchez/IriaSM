package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class EchoBot extends TelegramLongPollingBot {

    public void onUpdateReceived (final Update update){

        final String messageTextReceived = update.getMessage().getText();

        final long chatId = update.getMessage().getChatId();

        String nombre_usuario = update.getMessage().getFrom().getFirstName();

        SendMessage message = procesarMensaje(String.valueOf(chatId), messageTextReceived,nombre_usuario);

        try{

            execute(message);

        }catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public String getBotUsername() {
        return "IriaAulaNosa";
    }

    public String getBotToken() {
        return "5459300933:AAGq7ZkgS9kYX0GHerN_BX6MCx_M_Xo5PSY";
    }

    private SendMessage procesarMensaje(String chatId, String texto, String nombre) {

        SendMessage message = new SendMessage();
        message.setText("Me has dicho : " +texto+ " y tu nombre es : " +nombre);
        message.setChatId(String.valueOf(chatId));

        return message;
    }


}
