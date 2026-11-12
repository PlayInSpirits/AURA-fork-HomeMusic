.class public final synthetic Lpe2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lre2;


# direct methods
.method public synthetic constructor <init>(Lre2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lpe2;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lpe2;->o:Lre2;

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
    iget p1, p0, Lpe2;->n:I

    .line 2
    .line 3
    const-string v0, "HEX:#2E7D32"

    .line 4
    .line 5
    iget-object p0, p0, Lpe2;->o:Lre2;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    const-string p1, "HEX:#1976D2"

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lre2;->h0(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    invoke-virtual {p0, v0}, Lre2;->h0(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_1
    invoke-virtual {p0, v0}, Lre2;->h0(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_2
    const-string p1, "HEX:#FF5722"

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lre2;->h0(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_3
    invoke-virtual {p0}, Lkc1;->m()Lld1;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    new-instance v1, Lcn;

    .line 39
    .line 40
    const/16 v2, 0x17

    .line 41
    .line 42
    invoke-direct {v1, v2, p0}, Lcn;-><init>(ILjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    const-string v2, "dialog_result_key"

    .line 46
    .line 47
    invoke-virtual {p1, v2, v0, v1}, Lld1;->a0(Ljava/lang/String;Lle1;Lzd1;)V

    .line 48
    .line 49
    .line 50
    const p1, 0x7f1302a5

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, p1}, Lkc1;->s(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    new-instance v0, Lf50;

    .line 61
    .line 62
    invoke-direct {v0}, Lf50;-><init>()V

    .line 63
    .line 64
    .line 65
    new-instance v1, Landroid/os/Bundle;

    .line 66
    .line 67
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 68
    .line 69
    .line 70
    const-string v2, "arg_title"

    .line 71
    .line 72
    invoke-virtual {v1, v2, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v1}, Lkc1;->c0(Landroid/os/Bundle;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, Lkc1;->m()Lld1;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    const-string p1, "ColorPickerDialog"

    .line 83
    .line 84
    invoke-virtual {v0, p0, p1}, Lpp0;->m0(Lld1;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :pswitch_4
    iget-object p1, p0, Lre2;->l0:Lzc1;

    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    iget-object p1, p1, Lzc1;->j:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast p1, Lcom/google/android/material/materialswitch/MaterialSwitch;

    .line 96
    .line 97
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    const-string v1, "dynamic_color_accent"

    .line 117
    .line 118
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 123
    .line 124
    .line 125
    invoke-static {}, Lud3;->m()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-virtual {p0, p1}, Lre2;->h0(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :pswitch_5
    const-string p1, "HEX:#455A64"

    .line 134
    .line 135
    invoke-virtual {p0, p1}, Lre2;->h0(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :pswitch_6
    const-string p1, "HEX:#00796B"

    .line 140
    .line 141
    invoke-virtual {p0, p1}, Lre2;->h0(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :pswitch_7
    const-string p1, "HEX:#FFA000"

    .line 146
    .line 147
    invoke-virtual {p0, p1}, Lre2;->h0(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :pswitch_8
    const-string p1, "HEX:#7B1FA2"

    .line 152
    .line 153
    invoke-virtual {p0, p1}, Lre2;->h0(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    return-void

    .line 157
    :pswitch_9
    iget-object p1, p0, Lre2;->l0:Lzc1;

    .line 158
    .line 159
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    iget-object p1, p1, Lzc1;->k:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast p1, Lcom/google/android/material/materialswitch/MaterialSwitch;

    .line 165
    .line 166
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 167
    .line 168
    .line 169
    move-result p1

    .line 170
    const-string v0, "dark_theme_black"

    .line 171
    .line 172
    if-eqz p1, :cond_0

    .line 173
    .line 174
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    const/4 v1, 0x1

    .line 193
    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 194
    .line 195
    .line 196
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 197
    .line 198
    .line 199
    goto :goto_0

    .line 200
    :cond_0
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    const/4 v1, 0x0

    .line 219
    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 220
    .line 221
    .line 222
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 223
    .line 224
    .line 225
    :goto_0
    invoke-virtual {p0}, Lkc1;->l()Lnc1;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    check-cast p1, Ldf;

    .line 233
    .line 234
    invoke-static {p1}, Ljz4;->r(Ldf;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {p0}, Lkc1;->l()Lnc1;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    if-eqz p0, :cond_1

    .line 242
    .line 243
    invoke-virtual {p0}, Landroid/app/Activity;->recreate()V

    .line 244
    .line 245
    .line 246
    :cond_1
    return-void

    .line 247
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
