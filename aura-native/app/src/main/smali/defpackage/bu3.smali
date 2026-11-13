.class public final synthetic Ldefpackage/bu3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/a83;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ldefpackage/eu3;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/eu3;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldefpackage/bu3;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/bu3;->b:Ldefpackage/eu3;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Ldefpackage/bu3;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/bu3;->b:Ldefpackage/eu3;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/String;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, Ldefpackage/eu3;->C0:Ldefpackage/gu3;

    .line 31
    .line 32
    iget-object p0, p0, Ldefpackage/gu3;->g:Ldefpackage/k03;

    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    invoke-virtual {p0, p1}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    return-void

    .line 39
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 40
    .line 41
    if-eqz p1, :cond_3

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_3

    .line 48
    .line 49
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iget-object v0, p0, Ldefpackage/eu3;->C0:Ldefpackage/gu3;

    .line 54
    .line 55
    iget-object v0, v0, Ldefpackage/gu3;->d:Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;

    .line 56
    .line 57
    if-nez v0, :cond_1

    .line 58
    .line 59
    invoke-static {}, Lcom/eddyizm/tempus/App;->a()Landroid/content/Context;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    const v1, 0x7f130424

    .line 64
    .line 65
    .line 66
    :goto_0
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    goto :goto_1

    .line 71
    :cond_1
    invoke-static {}, Lcom/eddyizm/tempus/App;->a()Landroid/content/Context;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    const v1, 0x7f13042d

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :goto_1
    const/4 v1, 0x0

    .line 80
    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 85
    .line 86
    .line 87
    iget-object p1, p0, Ldefpackage/eu3;->D0:Lcom/eddyizm/tempus/interfaces/RadioCallback;

    .line 88
    .line 89
    if-eqz p1, :cond_2

    .line 90
    .line 91
    invoke-interface {p1}, Lcom/eddyizm/tempus/interfaces/RadioCallback;->onDismiss()V

    .line 92
    .line 93
    .line 94
    :cond_2
    iget-object p0, p0, Ldefpackage/pp0;->w0:Landroid/app/Dialog;

    .line 95
    .line 96
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 100
    .line 101
    .line 102
    :cond_3
    return-void

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
