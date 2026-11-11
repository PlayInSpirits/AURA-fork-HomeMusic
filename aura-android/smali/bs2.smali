.class public final synthetic Lbs2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lks2;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lls2;


# direct methods
.method public synthetic constructor <init>(Lls2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lbs2;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lbs2;->o:Lls2;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(Lfr2;)V
    .locals 2

    .line 1
    iget v0, p0, Lbs2;->n:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, Lbs2;->o:Lls2;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lls2;->g:Ltn2;

    .line 10
    .line 11
    iget-object p0, p0, Ltn2;->s:Lal3;

    .line 12
    .line 13
    invoke-virtual {p0}, Lal3;->I0()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    iget-object p0, p0, Lls2;->g:Ltn2;

    .line 18
    .line 19
    iget-object p0, p0, Ltn2;->s:Lal3;

    .line 20
    .line 21
    invoke-virtual {p0}, Lal3;->c0()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_1
    iget-object p0, p0, Lls2;->g:Ltn2;

    .line 26
    .line 27
    iget-object p0, p0, Ltn2;->s:Lal3;

    .line 28
    .line 29
    invoke-virtual {p0}, Lal3;->H0()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_2
    iget-object p0, p0, Lls2;->g:Ltn2;

    .line 34
    .line 35
    iget-object p0, p0, Ltn2;->s:Lal3;

    .line 36
    .line 37
    invoke-virtual {p0}, Lal3;->stop()V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_3
    iget-object p0, p0, Lls2;->g:Ltn2;

    .line 42
    .line 43
    iget-object p0, p0, Ltn2;->s:Lal3;

    .line 44
    .line 45
    invoke-virtual {p0}, Lal3;->b()V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_4
    iget-object p0, p0, Lls2;->g:Ltn2;

    .line 50
    .line 51
    invoke-virtual {p0, p1, v1}, Ltn2;->i(Lfr2;Z)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_5
    iget-object p0, p0, Lls2;->g:Ltn2;

    .line 56
    .line 57
    iget-object p0, p0, Ltn2;->s:Lal3;

    .line 58
    .line 59
    invoke-virtual {p0}, Lal3;->J0()V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :pswitch_6
    iget-object p0, p0, Lls2;->g:Ltn2;

    .line 64
    .line 65
    iget-object p0, p0, Ltn2;->s:Lal3;

    .line 66
    .line 67
    invoke-virtual {p0}, Lal3;->A()V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :pswitch_7
    iget-object p0, p0, Lls2;->g:Ltn2;

    .line 72
    .line 73
    iget-object p0, p0, Ltn2;->s:Lal3;

    .line 74
    .line 75
    invoke-virtual {p0}, Lal3;->S()V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :pswitch_8
    iget-object p0, p0, Lls2;->g:Ltn2;

    .line 80
    .line 81
    iget-object p1, p0, Ltn2;->s:Lal3;

    .line 82
    .line 83
    iget-boolean p0, p0, Ltn2;->p:Z

    .line 84
    .line 85
    invoke-static {p1, p0}, Lf35;->d0(Lqi3;Z)Z

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    if-eqz p0, :cond_0

    .line 90
    .line 91
    invoke-static {p1}, Lf35;->I(Lqi3;)Z

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_0
    if-eqz p1, :cond_1

    .line 96
    .line 97
    invoke-virtual {p1, v1}, Lal3;->S0(I)Z

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    if-eqz p0, :cond_1

    .line 102
    .line 103
    invoke-virtual {p1}, Lal3;->c()V

    .line 104
    .line 105
    .line 106
    :cond_1
    :goto_0
    return-void

    .line 107
    :pswitch_9
    iget-object p0, p0, Lls2;->g:Ltn2;

    .line 108
    .line 109
    iget-object p0, p0, Ltn2;->s:Lal3;

    .line 110
    .line 111
    sget-object p1, Lf35;->a:Ljava/lang/String;

    .line 112
    .line 113
    if-eqz p0, :cond_2

    .line 114
    .line 115
    invoke-virtual {p0, v1}, Lal3;->S0(I)Z

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    if-eqz p1, :cond_2

    .line 120
    .line 121
    invoke-virtual {p0}, Lal3;->c()V

    .line 122
    .line 123
    .line 124
    :cond_2
    return-void

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
