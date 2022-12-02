using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WFExamen
{
    public partial class FParte2 : Form
    {
        public FParte2()
        {
            InitializeComponent();
        }

        private void FParte2_Load(object sender, EventArgs e)
        {

        }

        private void btAñadir_Click(object sender, EventArgs e)
        {
            //String vacío
            String horario = "";

            //Si está marcado el check de mañana, entonces en ese string vacío, se llena con el texto del cb de mañana
            if (cbMañana.Checked){
             
                //Comprueba que el string esté vacío y sino, lo concatena con lo que tenía antes
                if (horario == ""){
                    horario = cbMañana.Text;
                }else{
                    horario = horario + "+" +cbMañana.Text;
                 }
            }if (cbTarde.Checked){

                if (horario == "") {
                    horario =  cbTarde.Text;
                } else{
                    horario = horario + "+" +cbTarde.Text;
                }
            }if (cbNoche.Checked){

                if (horario == ""){
                    horario = horario + cbNoche.Text;
                } else{
                    horario = horario + "+" + cbNoche.Text;
                }
            }

            listBox1.Items.Add(horario);
            horario = "";



}
    }

    }

