using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading;
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

             //CultureInfo cultura = new CultureInfo("en-US");
             //Thread.CurrentThread.CurrentCulture = cultura;
             //MessageBox.Show("Cultura actual " + CultureInfo.CurrentCulture.Name
             //+"\nFecha = "+ DateTime.Now.ToString()
             //+"\nFecha formateada = " + DateTime.Now.ToString("yyy-MM-dd"));



            //CultureInfo cultura = new CultureInfo("es-ES");
            //cultura.NumberFormat.CurrencySymbol = "$";
            //Thread.CurrentThread.CurrentCulture = cultura;
            //MessageBox.Show("Cultura actual = " + CultureInfo.CurrentCulture.Name
            //+ "\nPrecio = " + (4500.20).ToString("C"));


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

        
        private void LabelPanel1()
        {
            Label label = new Label();  
            label.Name = "label1";
            label.Text = "Ejercicio Windows Forms";
            this.panel1.Controls.Add(label);

            Font fuente = new Font ("Calibri" , 12);
            label.Font = fuente;

        }

       
        private void Boton1_Click(object sender, EventArgs e)
        {
            Ejercicio_1 ejercicio_1 = new Ejercicio_1();
            ejercicio_1.ShowDialog();           

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

        private void btEjercicio6_Click(object sender, EventArgs e)
        {
            Ejercicio6 ejercicio6 = new Ejercicio6();
            ejercicio6.ShowDialog();

        }

        private void btEjercicio7_Click(object sender, EventArgs e)
        {
            Ejercicio7 ejercicio7 = new Ejercicio7();
            ejercicio7.ShowDialog();
        }

        private void btEjercicio8_Click(object sender, EventArgs e)
        {
            Ejercicio8 ejercicio8 = new Ejercicio8();
            ejercicio8.ShowDialog();
        }

        private void btEjercicio9_Click(object sender, EventArgs e)
        {
            Ejercicio9 ejercicio9 = new Ejercicio9();
            ejercicio9.ShowDialog();

        }

        private void btEjercicio10_Click(object sender, EventArgs e)
        {
            
        }














        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void tableLayoutPanel1_Paint(object sender, PaintEventArgs e)
        {

        }

        private void FPrincipal_BackColorChanged(object sender, EventArgs e)
        {

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

        private void bt9nuevo_Click(object sender, EventArgs e)
        {
            Ejercicio9NUEVO ejercicio9NUEVO = new Ejercicio9NUEVO();
            ejercicio9NUEVO.ShowDialog();
        }

        private void bt9nuevo_Validating(object sender, CancelEventArgs e)
        {


        }

        private void btEjercicio10_Click_1(object sender, EventArgs e)
        {
            Ejercicio10 ejercicio10 = new Ejercicio10();
            ejercicio10.ShowDialog();

        }
    }
}
