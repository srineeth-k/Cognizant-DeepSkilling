interface PaymentProcessor {
    void processPayment(double amount);
}

class PayPalPayment {
    public void makePayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through PayPal.");
    }
}

class StripePayment {
    public void sendPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through Stripe.");
    }
}

class SquarePayment {
    public void pay(double amount) {
        System.out.println("Processing payment of $" + amount + " through Square.");
    }
}

class PayPalPaymentAdapter implements PaymentProcessor {
    private final PayPalPayment payPalPayment;

    public PayPalPaymentAdapter(PayPalPayment payPalPayment) {
        this.payPalPayment = payPalPayment;
    }

    @Override
    public void processPayment(double amount) {
        payPalPayment.makePayment(amount);
    }
}

class StripePaymentAdapter implements PaymentProcessor {
    private final StripePayment stripePayment;

    public StripePaymentAdapter(StripePayment stripePayment) {
        this.stripePayment = stripePayment;
    }

    @Override
    public void processPayment(double amount) {
        stripePayment.sendPayment(amount);
    }
}

class SquarePaymentAdapter implements PaymentProcessor {
    private final SquarePayment squarePayment;

    public SquarePaymentAdapter(SquarePayment squarePayment) {
        this.squarePayment = squarePayment;
    }

    @Override
    public void processPayment(double amount) {
        squarePayment.pay(amount);
    }
}

public class AdapterPatternExample {
    public static void main(String[] args) {
        PayPalPayment payPalPayment = new PayPalPayment();
        StripePayment stripePayment = new StripePayment();
        SquarePayment squarePayment = new SquarePayment();

        PaymentProcessor payPalAdapter = new PayPalPaymentAdapter(payPalPayment);
        PaymentProcessor stripeAdapter = new StripePaymentAdapter(stripePayment);
        PaymentProcessor squareAdapter = new SquarePaymentAdapter(squarePayment);

        System.out.println("Using PayPal Adapter:");
        payPalAdapter.processPayment(200.00);

        System.out.println("Using Stripe Adapter:");
        stripeAdapter.processPayment(500.00);

        System.out.println("Using Square Adapter:");
        squareAdapter.processPayment(1000.00);
    }
}

