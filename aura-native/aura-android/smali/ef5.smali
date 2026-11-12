.class public abstract Lef5;
.super Landroid/os/Binder;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/os/IInterface;


# instance fields
.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 27
    iput p1, p0, Lef5;->e:I

    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 1
    iput p1, p0, Lef5;->e:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p0, p2}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p0, p2}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_1
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p0, p2}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static L0(Landroid/os/Parcel;)V
    .locals 2

    .line 1
    sget v0, Lbi5;->a:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/os/Parcel;->dataAvail()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-gtz p0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Landroid/os/BadParcelableException;

    .line 11
    .line 12
    const-string v1, "Parcel data not fully consumed, unread size: "

    .line 13
    .line 14
    invoke-static {p0, v1}, Lf34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-direct {v0, p0}, Landroid/os/BadParcelableException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v0
.end method


# virtual methods
.method public abstract K0(Landroid/os/Parcel;I)Z
.end method

.method public abstract M0(ILandroid/os/Parcel;Landroid/os/Parcel;)Z
.end method

.method public abstract N0(ILandroid/os/Parcel;Landroid/os/Parcel;)Z
.end method

.method public O0(ILandroid/os/Parcel;Landroid/os/Parcel;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final asBinder()Landroid/os/IBinder;
    .locals 1

    .line 1
    iget v0, p0, Lef5;->e:I

    .line 2
    .line 3
    return-object p0
.end method

.method public final onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 4

    .line 1
    iget v0, p0, Lef5;->e:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const v2, 0xffffff

    .line 5
    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    if-le p1, v2, :cond_0

    .line 12
    .line 13
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 14
    .line 15
    .line 16
    move-result p3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0}, Landroid/os/Binder;->getInterfaceDescriptor()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    invoke-virtual {p2, p3}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    move p3, v1

    .line 26
    :goto_0
    if-eqz p3, :cond_1

    .line 27
    .line 28
    :goto_1
    move v1, v3

    .line 29
    goto/16 :goto_2

    .line 30
    .line 31
    :cond_1
    check-cast p0, Lt02;

    .line 32
    .line 33
    if-eq p1, v3, :cond_6

    .line 34
    .line 35
    const/4 p0, 0x2

    .line 36
    if-eq p1, p0, :cond_5

    .line 37
    .line 38
    const/4 p0, 0x3

    .line 39
    if-eq p1, p0, :cond_4

    .line 40
    .line 41
    const/4 p0, 0x4

    .line 42
    if-eq p1, p0, :cond_3

    .line 43
    .line 44
    const/4 p0, 0x5

    .line 45
    if-eq p1, p0, :cond_2

    .line 46
    .line 47
    goto/16 :goto_2

    .line 48
    .line 49
    :cond_2
    sget-object p0, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 50
    .line 51
    invoke-static {p2, p0}, Lbi5;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    check-cast p0, Lcom/google/android/gms/common/api/Status;

    .line 56
    .line 57
    sget-object p1, Lvx3;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 58
    .line 59
    invoke-static {p2, p1}, Lbi5;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, Lvx3;

    .line 64
    .line 65
    invoke-static {p2}, Lef5;->L0(Landroid/os/Parcel;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 72
    .line 73
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 74
    .line 75
    .line 76
    throw p0

    .line 77
    :cond_3
    sget-object p0, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 78
    .line 79
    invoke-static {p2, p0}, Lbi5;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    check-cast p0, Lcom/google/android/gms/common/api/Status;

    .line 84
    .line 85
    sget-object p1, Lif3;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 86
    .line 87
    invoke-static {p2, p1}, Lbi5;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    check-cast p1, Lif3;

    .line 92
    .line 93
    invoke-static {p2}, Lef5;->L0(Landroid/os/Parcel;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 100
    .line 101
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 102
    .line 103
    .line 104
    throw p0

    .line 105
    :cond_4
    sget-object p0, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 106
    .line 107
    invoke-static {p2, p0}, Lbi5;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    check-cast p0, Lcom/google/android/gms/common/api/Status;

    .line 112
    .line 113
    sget-object p1, Lo30;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 114
    .line 115
    invoke-static {p2, p1}, Lbi5;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    check-cast p1, Lo30;

    .line 120
    .line 121
    invoke-static {p2}, Lef5;->L0(Landroid/os/Parcel;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 128
    .line 129
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 130
    .line 131
    .line 132
    throw p0

    .line 133
    :cond_5
    sget-object p0, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 134
    .line 135
    invoke-static {p2, p0}, Lbi5;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    check-cast p0, Lcom/google/android/gms/common/api/Status;

    .line 140
    .line 141
    sget-object p1, Ldy3;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 142
    .line 143
    invoke-static {p2, p1}, Lbi5;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    check-cast p1, Ldy3;

    .line 148
    .line 149
    invoke-static {p2}, Lef5;->L0(Landroid/os/Parcel;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 156
    .line 157
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 158
    .line 159
    .line 160
    throw p0

    .line 161
    :cond_6
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 162
    .line 163
    invoke-static {p2, p1}, Lbi5;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 168
    .line 169
    sget-object p3, Lhf3;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 170
    .line 171
    invoke-static {p2, p3}, Lbi5;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 172
    .line 173
    .line 174
    move-result-object p3

    .line 175
    check-cast p3, Lhf3;

    .line 176
    .line 177
    invoke-static {p2}, Lef5;->L0(Landroid/os/Parcel;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    iget-object p0, p0, Lt02;->f:Lcr4;

    .line 184
    .line 185
    invoke-static {p1, p3, p0}, Lg12;->R(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lcr4;)V

    .line 186
    .line 187
    .line 188
    goto/16 :goto_1

    .line 189
    .line 190
    :goto_2
    return v1

    .line 191
    :pswitch_0
    if-le p1, v2, :cond_7

    .line 192
    .line 193
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 194
    .line 195
    .line 196
    move-result p4

    .line 197
    if-eqz p4, :cond_8

    .line 198
    .line 199
    goto :goto_3

    .line 200
    :cond_7
    invoke-virtual {p0}, Landroid/os/Binder;->getInterfaceDescriptor()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p4

    .line 204
    invoke-virtual {p2, p4}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    :cond_8
    invoke-virtual {p0, p1, p2, p3}, Lef5;->O0(ILandroid/os/Parcel;Landroid/os/Parcel;)Z

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    :goto_3
    return v3

    .line 212
    :pswitch_1
    if-le p1, v2, :cond_9

    .line 213
    .line 214
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 215
    .line 216
    .line 217
    move-result v1

    .line 218
    goto :goto_4

    .line 219
    :cond_9
    invoke-virtual {p0}, Landroid/os/Binder;->getInterfaceDescriptor()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object p3

    .line 223
    invoke-virtual {p2, p3}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    :goto_4
    if-eqz v1, :cond_a

    .line 227
    .line 228
    goto :goto_5

    .line 229
    :cond_a
    invoke-virtual {p0, p2, p1}, Lef5;->K0(Landroid/os/Parcel;I)Z

    .line 230
    .line 231
    .line 232
    move-result v3

    .line 233
    :goto_5
    return v3

    .line 234
    :pswitch_2
    if-le p1, v2, :cond_b

    .line 235
    .line 236
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 237
    .line 238
    .line 239
    move-result p4

    .line 240
    if-eqz p4, :cond_c

    .line 241
    .line 242
    goto :goto_6

    .line 243
    :cond_b
    invoke-virtual {p0}, Landroid/os/Binder;->getInterfaceDescriptor()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object p4

    .line 247
    invoke-virtual {p2, p4}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    :cond_c
    invoke-virtual {p0, p1, p2, p3}, Lef5;->N0(ILandroid/os/Parcel;Landroid/os/Parcel;)Z

    .line 251
    .line 252
    .line 253
    move-result v3

    .line 254
    :goto_6
    return v3

    .line 255
    :pswitch_3
    if-le p1, v2, :cond_d

    .line 256
    .line 257
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 258
    .line 259
    .line 260
    move-result p4

    .line 261
    if-eqz p4, :cond_e

    .line 262
    .line 263
    goto :goto_7

    .line 264
    :cond_d
    invoke-virtual {p0}, Landroid/os/Binder;->getInterfaceDescriptor()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object p4

    .line 268
    invoke-virtual {p2, p4}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    :cond_e
    invoke-virtual {p0, p1, p2, p3}, Lef5;->M0(ILandroid/os/Parcel;Landroid/os/Parcel;)Z

    .line 272
    .line 273
    .line 274
    move-result v3

    .line 275
    :goto_7
    return v3

    .line 276
    nop

    .line 277
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
