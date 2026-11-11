.class public final synthetic Lxn1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lfo1;


# direct methods
.method public synthetic constructor <init>(Lfo1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lxn1;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lxn1;->o:Lfo1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget p1, p0, Lxn1;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Lxn1;->o:Lfo1;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lfo1;->m()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object p0, p0, Lfo1;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Luc1;

    .line 15
    .line 16
    iget-object p0, p0, Luc1;->r:Lcom/google/android/material/textfield/TextInputEditText;

    .line 17
    .line 18
    const-string p1, "http://192.168.1.129:4533"

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_1
    iget-object p1, p0, Lfo1;->i:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Lcom/eddyizm/tempus/homemusic/HubAuthOptions;

    .line 27
    .line 28
    if-eqz p1, :cond_2

    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/eddyizm/tempus/homemusic/HubAuthOptions;->getGoogleClientId()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    if-nez p1, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget-boolean v0, p0, Lfo1;->a:Z

    .line 38
    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const/4 v0, 0x1

    .line 43
    invoke-virtual {p0, v0}, Lfo1;->r(Z)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lfo1;->b:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, Lcom/eddyizm/tempus/ui/fragment/LoginFragment;

    .line 49
    .line 50
    invoke-virtual {v0}, Lkc1;->X()Lnc1;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    new-instance v1, Lzh0;

    .line 55
    .line 56
    const/16 v2, 0x1d

    .line 57
    .line 58
    invoke-direct {v1, v2, p0}, Lzh0;-><init>(ILjava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    invoke-static {v0, p1, v1}, Lud3;->M(Lnc1;Ljava/lang/String;Ljj1;)V

    .line 62
    .line 63
    .line 64
    :cond_2
    :goto_0
    return-void

    .line 65
    :pswitch_2
    invoke-virtual {p0}, Lfo1;->q()V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :pswitch_3
    sget-object p1, Lco1;->q:Lco1;

    .line 70
    .line 71
    invoke-virtual {p0, p1}, Lfo1;->s(Lco1;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :pswitch_4
    iget-object p1, p0, Lfo1;->d:Ljava/io/Serializable;

    .line 76
    .line 77
    check-cast p1, Lco1;

    .line 78
    .line 79
    sget-object v0, Lco1;->o:Lco1;

    .line 80
    .line 81
    if-ne p1, v0, :cond_3

    .line 82
    .line 83
    sget-object v0, Lco1;->p:Lco1;

    .line 84
    .line 85
    :cond_3
    invoke-virtual {p0, v0}, Lfo1;->s(Lco1;)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :pswitch_5
    sget-object p1, Lco1;->n:Lco1;

    .line 90
    .line 91
    invoke-virtual {p0, p1}, Lfo1;->s(Lco1;)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
