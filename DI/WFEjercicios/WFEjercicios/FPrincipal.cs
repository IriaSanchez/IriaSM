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
           this.btSalir.Text = "Salir";


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

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void Boton1_Click(object sender, EventArgs e)
        {
            Ejercicio_1 ejercicio_1 = new Ejercicio_1();
            ejercicio_1.ShowDialog();           

        }

        private void tableLayoutPanel1_Paint(object sender, PaintEventArgs e)
        {

        }

        private void Boton2_Click(object sender, EventArgs e)
        {
            Ejercicio2 ejercicio2 = new Ejercicio2();
            ejercicio2.ShowDialog();
        }

        private void Boton3_Click(object sender, EventArgs e)
        {
            Ejercicio3 ejercicio3 = new Ejercicio3();
            ejercicio3.ShowDialog();
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void Boton4_Click(object sender, EventArgs e)
        {
           Ejercicio4 ejercicio4 = new Ejercicio4();
            ejercicio4.ShowDialog();    
        }

        private void button6_Click(object sender, EventArgs e)
        {
            Ejercicio5 ejercicio5 = new Ejercicio5();
            ejercicio5.ShowDialog();
        }
    }
}
