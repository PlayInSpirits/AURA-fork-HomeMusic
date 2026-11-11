.class public final Ljb2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ljb2;->n:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 1
    iget p0, p0, Ljb2;->n:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/util/Map$Entry;

    .line 7
    .line 8
    check-cast p2, Ljava/util/Map$Entry;

    .line 9
    .line 10
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p0, Ljava/lang/Comparable;

    .line 25
    .line 26
    check-cast p1, Ljava/lang/Comparable;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    return p0

    .line 39
    :pswitch_0
    check-cast p1, Lcom/google/android/gms/common/api/Scope;

    .line 40
    .line 41
    check-cast p2, Lcom/google/android/gms/common/api/Scope;

    .line 42
    .line 43
    iget-object p0, p1, Lcom/google/android/gms/common/api/Scope;->o:Ljava/lang/String;

    .line 44
    .line 45
    iget-object p1, p2, Lcom/google/android/gms/common/api/Scope;->o:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    return p0

    .line 52
    :pswitch_1
    check-cast p1, Lne5;

    .line 53
    .line 54
    iget-object p0, p1, Lne5;->a:Lge3;

    .line 55
    .line 56
    check-cast p2, Lne5;

    .line 57
    .line 58
    iget-object p1, p2, Lne5;->a:Lge3;

    .line 59
    .line 60
    invoke-static {p0, p1}, Lfu;->l(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    return p0

    .line 65
    :pswitch_2
    check-cast p1, Landroid/view/View;

    .line 66
    .line 67
    check-cast p2, Landroid/view/View;

    .line 68
    .line 69
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    sub-int/2addr p0, p1

    .line 78
    return p0

    .line 79
    :pswitch_3
    check-cast p1, Lqq4;

    .line 80
    .line 81
    iget-object p0, p1, Lqq4;->a:Ljava/lang/String;

    .line 82
    .line 83
    check-cast p2, Lqq4;

    .line 84
    .line 85
    iget-object p1, p2, Lqq4;->a:Ljava/lang/String;

    .line 86
    .line 87
    invoke-static {p0, p1}, Lfu;->l(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    return p0

    .line 92
    :pswitch_4
    check-cast p1, Loq4;

    .line 93
    .line 94
    iget-object p0, p1, Loq4;->a:Ljava/lang/String;

    .line 95
    .line 96
    check-cast p2, Loq4;

    .line 97
    .line 98
    iget-object p1, p2, Loq4;->a:Ljava/lang/String;

    .line 99
    .line 100
    invoke-static {p0, p1}, Lfu;->l(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    return p0

    .line 105
    :pswitch_5
    check-cast p1, Ljava/util/Map$Entry;

    .line 106
    .line 107
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    check-cast p0, Ljava/lang/Integer;

    .line 112
    .line 113
    check-cast p2, Ljava/util/Map$Entry;

    .line 114
    .line 115
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    check-cast p1, Ljava/lang/Integer;

    .line 120
    .line 121
    invoke-static {p0, p1}, Lfu;->l(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    return p0

    .line 126
    :pswitch_6
    check-cast p1, Ljava/util/Map$Entry;

    .line 127
    .line 128
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    check-cast p0, Ljava/lang/Integer;

    .line 133
    .line 134
    check-cast p2, Ljava/util/Map$Entry;

    .line 135
    .line 136
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    check-cast p1, Ljava/lang/Integer;

    .line 141
    .line 142
    invoke-static {p0, p1}, Lfu;->l(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 143
    .line 144
    .line 145
    move-result p0

    .line 146
    return p0

    .line 147
    :pswitch_7
    check-cast p1, Lai4;

    .line 148
    .line 149
    check-cast p2, Lai4;

    .line 150
    .line 151
    iget p0, p1, Lai4;->o:I

    .line 152
    .line 153
    iget p1, p2, Lai4;->o:I

    .line 154
    .line 155
    sub-int/2addr p0, p1

    .line 156
    return p0

    .line 157
    :pswitch_8
    check-cast p2, Ljava/util/Map$Entry;

    .line 158
    .line 159
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    check-cast p0, Lsp3;

    .line 164
    .line 165
    iget-wide v0, p0, Lsp3;->i:J

    .line 166
    .line 167
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    check-cast p1, Ljava/util/Map$Entry;

    .line 172
    .line 173
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    check-cast p1, Lsp3;

    .line 178
    .line 179
    iget-wide p1, p1, Lsp3;->i:J

    .line 180
    .line 181
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-static {p0, p1}, Lfu;->l(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 186
    .line 187
    .line 188
    move-result p0

    .line 189
    return p0

    .line 190
    :pswitch_9
    check-cast p2, Lsp3;

    .line 191
    .line 192
    iget-wide v0, p2, Lsp3;->i:J

    .line 193
    .line 194
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    check-cast p1, Lsp3;

    .line 199
    .line 200
    iget-wide p1, p1, Lsp3;->i:J

    .line 201
    .line 202
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    invoke-static {p0, p1}, Lfu;->l(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 207
    .line 208
    .line 209
    move-result p0

    .line 210
    return p0

    .line 211
    :pswitch_a
    check-cast p1, Ljava/lang/Comparable;

    .line 212
    .line 213
    check-cast p2, Ljava/lang/Comparable;

    .line 214
    .line 215
    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 216
    .line 217
    .line 218
    move-result p0

    .line 219
    return p0

    .line 220
    nop

    .line 221
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
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
