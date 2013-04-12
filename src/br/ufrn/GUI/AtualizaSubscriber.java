/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.GUI;

import br.ufrn.subscriber.Subscriber;

/**
 *
 * @author Jorge
 */
public class AtualizaSubscriber extends Subscriber{

    
    SecretariaServicosUrbanos subscriber = new SecretariaServicosUrbanos();
    
    public AtualizaSubscriber(String topic) {
        super(topic);
    }

    @Override
    public void tratarMensagem(String mensagem) {
        subscriber.exibirInformacao(mensagem);
    }
    

    
    
}
