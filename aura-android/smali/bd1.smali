.class public final Lbd1;
.super Lv83;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lbd1;->d:I

    .line 2
    .line 3
    iput-object p2, p0, Lbd1;->e:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lv83;-><init>(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lcom/eddyizm/tempus/ui/activity/MainActivity;Z)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lbd1;->d:I

    .line 10
    iput-object p1, p0, Lbd1;->e:Ljava/lang/Object;

    invoke-direct {p0, p2}, Lv83;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    .line 1
    iget v0, p0, Lbd1;->d:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, Lbd1;->e:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast v2, Lv23;

    .line 10
    .line 11
    iget-object p0, v2, Lv23;->g:Lii;

    .line 12
    .line 13
    invoke-virtual {p0}, Lii;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {v2}, Lv23;->g()Lr23;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget p0, p0, Lr23;->u:I

    .line 28
    .line 29
    invoke-virtual {v2, p0, v1}, Lv23;->p(IZ)Z

    .line 30
    .line 31
    .line 32
    :goto_0
    return-void

    .line 33
    :pswitch_0
    check-cast v2, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 34
    .line 35
    invoke-virtual {v2}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->q()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_1
    check-cast v2, Lcom/eddyizm/tempus/homemusic/HubFragment;

    .line 40
    .line 41
    iget-object v0, v2, Lcom/eddyizm/tempus/homemusic/HubFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    const-string v4, "activity"

    .line 45
    .line 46
    if-eqz v0, :cond_7

    .line 47
    .line 48
    iget-object v5, v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 49
    .line 50
    if-eqz v5, :cond_3

    .line 51
    .line 52
    iget-object v5, v5, Lzg5;->n:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v5, Lau;

    .line 55
    .line 56
    iget-boolean v6, v5, Lau;->a:Z

    .line 57
    .line 58
    if-nez v6, :cond_1

    .line 59
    .line 60
    iget-object v5, v5, Lau;->b:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v5, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 63
    .line 64
    iget v5, v5, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y:I

    .line 65
    .line 66
    const/4 v6, 0x3

    .line 67
    if-eq v5, v6, :cond_1

    .line 68
    .line 69
    const/4 v6, 0x2

    .line 70
    if-ne v5, v6, :cond_3

    .line 71
    .line 72
    :cond_1
    if-eqz v0, :cond_2

    .line 73
    .line 74
    invoke-virtual {v0}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->q()V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    invoke-static {v4}, Lh12;->Q(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw v3

    .line 82
    :cond_3
    iget-object v0, v2, Lcom/eddyizm/tempus/homemusic/HubFragment;->n0:Landroid/webkit/WebView;

    .line 83
    .line 84
    if-eqz v0, :cond_4

    .line 85
    .line 86
    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-ne v0, v1, :cond_4

    .line 91
    .line 92
    iget-object p0, v2, Lcom/eddyizm/tempus/homemusic/HubFragment;->n0:Landroid/webkit/WebView;

    .line 93
    .line 94
    if-eqz p0, :cond_5

    .line 95
    .line 96
    invoke-virtual {p0}, Landroid/webkit/WebView;->goBack()V

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_4
    const/4 v0, 0x0

    .line 101
    invoke-virtual {p0, v0}, Lv83;->c(Z)V

    .line 102
    .line 103
    .line 104
    iget-object p0, v2, Lcom/eddyizm/tempus/homemusic/HubFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 105
    .line 106
    if-eqz p0, :cond_6

    .line 107
    .line 108
    invoke-virtual {p0}, Ll70;->i()La93;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    invoke-virtual {p0}, La93;->b()Ly83;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-virtual {p0}, Lv33;->a()V

    .line 117
    .line 118
    .line 119
    :cond_5
    :goto_1
    return-void

    .line 120
    :cond_6
    invoke-static {v4}, Lh12;->Q(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw v3

    .line 124
    :cond_7
    invoke-static {v4}, Lh12;->Q(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw v3

    .line 128
    :pswitch_2
    check-cast v2, Lrm3;

    .line 129
    .line 130
    invoke-virtual {v2}, Lrm3;->z()V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :pswitch_3
    check-cast v2, Lfo1;

    .line 135
    .line 136
    iget-boolean p0, v2, Lfo1;->a:Z

    .line 137
    .line 138
    if-nez p0, :cond_b

    .line 139
    .line 140
    iget-object p0, v2, Lfo1;->d:Ljava/io/Serializable;

    .line 141
    .line 142
    check-cast p0, Lco1;

    .line 143
    .line 144
    sget-object v0, Lco1;->p:Lco1;

    .line 145
    .line 146
    if-ne p0, v0, :cond_8

    .line 147
    .line 148
    iget-object v0, v2, Lfo1;->f:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v0, Ljava/lang/String;

    .line 151
    .line 152
    if-eqz v0, :cond_9

    .line 153
    .line 154
    :cond_8
    sget-object v0, Lco1;->q:Lco1;

    .line 155
    .line 156
    if-ne p0, v0, :cond_a

    .line 157
    .line 158
    :cond_9
    sget-object p0, Lco1;->o:Lco1;

    .line 159
    .line 160
    invoke-virtual {v2, p0}, Lfo1;->s(Lco1;)V

    .line 161
    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_a
    sget-object p0, Lco1;->n:Lco1;

    .line 165
    .line 166
    invoke-virtual {v2, p0}, Lfo1;->s(Lco1;)V

    .line 167
    .line 168
    .line 169
    :cond_b
    :goto_2
    return-void

    .line 170
    :pswitch_4
    check-cast v2, Lld1;

    .line 171
    .line 172
    invoke-virtual {v2, v1}, Lld1;->y(Z)Z

    .line 173
    .line 174
    .line 175
    iget-object p0, v2, Lld1;->h:Lbd1;

    .line 176
    .line 177
    iget-boolean p0, p0, Lv83;->b:Z

    .line 178
    .line 179
    if-eqz p0, :cond_c

    .line 180
    .line 181
    invoke-virtual {v2}, Lld1;->Q()Z

    .line 182
    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_c
    iget-object p0, v2, Lld1;->g:La93;

    .line 186
    .line 187
    invoke-virtual {p0}, La93;->b()Ly83;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    invoke-virtual {p0}, Lv33;->a()V

    .line 192
    .line 193
    .line 194
    :goto_3
    return-void

    .line 195
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
