.class public final synthetic Ldefpackage/ja;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/if1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ldefpackage/ra;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/ra;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldefpackage/ja;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/ja;->o:Ldefpackage/ra;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Ldefpackage/ja;->n:I

    .line 2
    .line 3
    sget-object v1, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/ja;->o:Ldefpackage/ra;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ldefpackage/mf3;

    .line 11
    .line 12
    invoke-virtual {p0}, Ldefpackage/ra;->getPointerIconService()Ldefpackage/nn3;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :pswitch_0
    check-cast p1, Ldefpackage/mf3;

    .line 18
    .line 19
    invoke-virtual {p0}, Ldefpackage/ra;->getTextToolbar()Ldefpackage/at4;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :pswitch_1
    check-cast p1, Ldefpackage/mf3;

    .line 25
    .line 26
    invoke-virtual {p0}, Ldefpackage/ra;->getSoftwareKeyboardController()Ldefpackage/wh4;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :pswitch_2
    check-cast p1, Ldefpackage/mf3;

    .line 32
    .line 33
    invoke-virtual {p0}, Ldefpackage/ra;->getTextInputService()Ldefpackage/is4;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :pswitch_3
    check-cast p1, Ldefpackage/mf3;

    .line 39
    .line 40
    invoke-virtual {p0}, Ldefpackage/ra;->getInputModeManager()Ldefpackage/rz1;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :pswitch_4
    check-cast p1, Ldefpackage/mf3;

    .line 46
    .line 47
    invoke-virtual {p0}, Ldefpackage/ra;->getScrollCaptureInProgress()Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0

    .line 56
    :pswitch_5
    check-cast p1, Ldefpackage/mf3;

    .line 57
    .line 58
    invoke-virtual {p0}, Ldefpackage/ra;->getSavedStateRegistry()Ldefpackage/bs0;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :pswitch_6
    check-cast p1, Ldefpackage/o91;

    .line 64
    .line 65
    invoke-virtual {p0}, Ldefpackage/ra;->getFocusOwner()Ldefpackage/u91;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    iget p1, p1, Ldefpackage/o91;->a:I

    .line 70
    .line 71
    check-cast p0, Ldefpackage/ey;

    .line 72
    .line 73
    iget-object v0, p0, Ldefpackage/ey;->a:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, Ldefpackage/ra;

    .line 76
    .line 77
    new-instance v2, Ldefpackage/jx3;

    .line 78
    .line 79
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 80
    .line 81
    .line 82
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 83
    .line 84
    iput-object v3, v2, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 85
    .line 86
    invoke-virtual {p0}, Ldefpackage/ey;->f()Ldefpackage/ba1;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-virtual {v0}, Ldefpackage/ra;->getEmbeddedViewFocusRect()Ldefpackage/wv3;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    new-instance v4, Ldefpackage/v91;

    .line 95
    .line 96
    invoke-direct {v4, p1, v2}, Ldefpackage/v91;-><init>(ILdefpackage/jx3;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0, p1, v0, v4}, Ldefpackage/ey;->e(ILdefpackage/wv3;Ldefpackage/if1;)Ljava/lang/Boolean;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 104
    .line 105
    invoke-static {p1, v0}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_0

    .line 110
    .line 111
    invoke-virtual {p0}, Ldefpackage/ey;->f()Ldefpackage/ba1;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    if-eq v3, p0, :cond_0

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_0
    if-eqz p1, :cond_2

    .line 119
    .line 120
    iget-object p0, v2, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 121
    .line 122
    if-nez p0, :cond_1

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 126
    .line 127
    .line 128
    move-result p0

    .line 129
    if-eqz p0, :cond_2

    .line 130
    .line 131
    iget-object p0, v2, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast p0, Ljava/lang/Boolean;

    .line 134
    .line 135
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    :cond_2
    :goto_0
    return-object v1

    .line 139
    :pswitch_7
    check-cast p1, Ldefpackage/gf1;

    .line 140
    .line 141
    invoke-virtual {p0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    if-eqz v0, :cond_3

    .line 146
    .line 147
    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    goto :goto_1

    .line 152
    :cond_3
    const/4 v0, 0x0

    .line 153
    :goto_1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    if-ne v0, v2, :cond_4

    .line 158
    .line 159
    invoke-interface {p1}, Ldefpackage/gf1;->invoke()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    if-eqz p0, :cond_5

    .line 168
    .line 169
    new-instance v0, Ldefpackage/ga;

    .line 170
    .line 171
    const/4 v2, 0x0

    .line 172
    invoke-direct {v0, v2, p1}, Ldefpackage/ga;-><init>(ILdefpackage/gf1;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 176
    .line 177
    .line 178
    :cond_5
    :goto_2
    return-object v1

    .line 179
    :pswitch_data_0
    .packed-switch 0x0
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
