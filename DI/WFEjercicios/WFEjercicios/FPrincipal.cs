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
    public partial class FPrincipal : Form
    {
        public FPrincipal()
        {
            InitializeComponent();
        }

        private void FPrincipal_Load(object sender, EventArgs e)
        {
            this.BackColor = Color.LimeGreen;
            this.Text = "Esta es la carga del formulario";
            // this.agregarBotonDinamico();
           this.LabelPanel1();
           this.panel1.BackColor = Color.Cyan;
           this.panel2.BackColor = Color.Chocolate;
           this.panel3.BackColor = Color.DarkViolet;
           this.panel4.BackColor = Color.Indigo;
           this.button1.Text = "Salir";


        }

        private void agregarBotonDinamico()
        {
            Button btnDinamico = new Button();
            btnDinamico.Name = "btnDinamico";
            btnDinamico.Text = "Nuevo botón";
            btnDinamico.Location = new System.Drawing.Point(25, 25);
            btnDinamico.Size = new System.Drawing.Size(100, 25);
            this.Controls.Add(btnDinamico);

        }

        private void FPrincipal_BackColorChanged(object sender, EventArgs e)
        {

        }

        private void LabelPanel1()
        {
            Label label = new Label();  
            label.Name = "label1";
            label.Text = "Ejercicio Windows Forms";
            this.panel1.Controls.Add(label);

            Font fuente = new Font ("Calibri" , 12);
            label.Font = fuente;

        }



        private void button1_Click(object sender, EventArgs e)
        {
           

        }
    }
}
