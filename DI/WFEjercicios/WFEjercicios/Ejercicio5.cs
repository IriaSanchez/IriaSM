using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WFEjercicios
{
    public partial class Ejercicio5 : Form
    {

        int numActual = 0;
        int numProximo = 0;


        public Ejercicio5() {

            InitializeComponent();
        }

        private void Ejercicio5_Load(object sender, EventArgs e){
        }




        //textbox dónde escribimos un número
        private void tbEjercicio5_TextChanged(object sender, EventArgs e) {
            
        }






        //boton para iniciar o pausar la cuenta atrás
        private void btIniciarPausar_Click(object sender, EventArgs e){

            //Cuando pulsas el botón no empieza a contar desde el numero del textbox sino dónde lo dejaste

            if (lbCuentaAtras.Text == "") {

                lbCuentaAtras.Text = tbEjercicio5.Text;
            }

            //Para activar y desactivar

             timer1.Enabled =!timer1.Enabled;
        }

       



        //label donde aparece la cuenta atras

        private void lbCuentaAtras_Click(object sender, EventArgs e){

            //Recoger lo escrito en el tex box y añadirlo al label
            this.lbCuentaAtras.Text = this.tbEjercicio5.Text;
            this.tbEjercicio5.Enabled = true;
            this.tbEjercicio5.Visible = true;
        }



        //timer
        private void timer1_Tick(object sender, EventArgs e){

            //Pasar de texto a int y restar de uno en uno
            int numActual = Int32.Parse(lbCuentaAtras.Text);
            int numProximo = numActual - 1;

            //Cerrar cuando llegue a 0
            if (numProximo <= 0){

                this.Close();
            }

            lbCuentaAtras.Text = numProximo.ToString();
     }

    }
}
