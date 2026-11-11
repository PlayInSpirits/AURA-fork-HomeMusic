.class public final synthetic Lmk3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements La83;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lqk3;


# direct methods
.method public synthetic constructor <init>(Lqk3;I)V
    .locals 0

    .line 1
    iput p2, p0, Lmk3;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lmk3;->b:Lqk3;

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
    .locals 3

    .line 1
    iget v0, p0, Lmk3;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Lmk3;->b:Lqk3;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/LyricsList;

    .line 10
    .line 11
    invoke-static {p1}, Lqk3;->h0(Lcom/eddyizm/tempus/subsonic/models/LyricsList;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, Lqk3;->p0:Landroid/os/Handler;

    .line 18
    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    iget-object v0, p0, Lqk3;->q0:Lnk3;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Lqk3;->p0:Landroid/os/Handler;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/LyricsList;->getStructuredLyrics()Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const/4 v0, 0x0

    .line 34
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/StructuredLyrics;

    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/StructuredLyrics;->getSynced()Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-nez p1, :cond_1

    .line 45
    .line 46
    iget-object p1, p0, Lqk3;->p0:Landroid/os/Handler;

    .line 47
    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    iget-object v0, p0, Lqk3;->q0:Lnk3;

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 53
    .line 54
    .line 55
    iput-object v1, p0, Lqk3;->p0:Landroid/os/Handler;

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    new-instance p1, Landroid/os/Handler;

    .line 59
    .line 60
    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, Lqk3;->p0:Landroid/os/Handler;

    .line 64
    .line 65
    new-instance v0, Lnk3;

    .line 66
    .line 67
    const/4 v1, 0x1

    .line 68
    invoke-direct {v0, p0, v1}, Lnk3;-><init>(Lqk3;I)V

    .line 69
    .line 70
    .line 71
    iput-object v0, p0, Lqk3;->q0:Lnk3;

    .line 72
    .line 73
    const-wide/16 v1, 0xfa

    .line 74
    .line 75
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 76
    .line 77
    .line 78
    :cond_2
    :goto_0
    return-void

    .line 79
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 80
    .line 81
    iput-object p1, p0, Lqk3;->u0:Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {p0}, Lqk3;->i0()V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :pswitch_1
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/LyricsList;

    .line 88
    .line 89
    iput-object p1, p0, Lqk3;->s0:Lcom/eddyizm/tempus/subsonic/models/LyricsList;

    .line 90
    .line 91
    iput-object v1, p0, Lqk3;->t0:Ljava/lang/Integer;

    .line 92
    .line 93
    invoke-virtual {p0}, Lqk3;->i0()V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :pswitch_2
    check-cast p1, Ljava/lang/String;

    .line 98
    .line 99
    iput-object p1, p0, Lqk3;->r0:Ljava/lang/String;

    .line 100
    .line 101
    invoke-virtual {p0}, Lqk3;->i0()V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :pswitch_3
    check-cast p1, Ljava/lang/Boolean;

    .line 106
    .line 107
    iget-object v0, p0, Lqk3;->l0:Lml3;

    .line 108
    .line 109
    if-eqz v0, :cond_4

    .line 110
    .line 111
    iget-object v0, v0, Lml3;->a:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v0, Lcom/google/android/material/button/MaterialButton;

    .line 114
    .line 115
    if-eqz p1, :cond_3

    .line 116
    .line 117
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    if-eqz p1, :cond_3

    .line 122
    .line 123
    const p1, 0x7f080120

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, p1}, Lcom/google/android/material/button/MaterialButton;->setIconResource(I)V

    .line 127
    .line 128
    .line 129
    const p1, 0x7f1303d4

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0, p1}, Lkc1;->s(I)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-virtual {v0, p0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 137
    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_3
    const p1, 0x7f080121

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, p1}, Lcom/google/android/material/button/MaterialButton;->setIconResource(I)V

    .line 144
    .line 145
    .line 146
    const p1, 0x7f1303d1

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0, p1}, Lkc1;->s(I)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    invoke-virtual {v0, p0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 154
    .line 155
    .line 156
    :cond_4
    :goto_1
    return-void

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
