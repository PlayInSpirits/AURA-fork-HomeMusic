.class public final synthetic Luk3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements La83;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lwk3;


# direct methods
.method public synthetic constructor <init>(Lwk3;I)V
    .locals 0

    .line 1
    iput p2, p0, Luk3;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Luk3;->b:Lwk3;

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
    iget v0, p0, Luk3;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object p0, p0, Luk3;->b:Lwk3;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-static {}, Lu52;->c()Lv52;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-boolean v0, v0, Lv52;->a:Z

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Lwk3;->j0()V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v0, p0, Lwk3;->w0:Lyk3;

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    iget-object v0, p0, Lwk3;->u0:Lli3;

    .line 29
    .line 30
    iget-object v0, v0, Lli3;->b:Lk03;

    .line 31
    .line 32
    invoke-virtual {v0}, Lad2;->d()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Ljava/lang/String;

    .line 37
    .line 38
    iget-object p0, p0, Lwk3;->w0:Lyk3;

    .line 39
    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_1

    .line 47
    .line 48
    move v1, v2

    .line 49
    :cond_1
    invoke-virtual {p0, v0, v1}, Lyk3;->q(Ljava/lang/String;Z)V

    .line 50
    .line 51
    .line 52
    :cond_2
    :goto_0
    return-void

    .line 53
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {}, Lu52;->c()Lv52;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget-boolean v0, v0, Lv52;->a:Z

    .line 60
    .line 61
    if-eqz v0, :cond_3

    .line 62
    .line 63
    invoke-virtual {p0}, Lwk3;->j0()V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    iget-object v0, p0, Lwk3;->w0:Lyk3;

    .line 68
    .line 69
    if-eqz v0, :cond_5

    .line 70
    .line 71
    iget-object v0, p0, Lwk3;->u0:Lli3;

    .line 72
    .line 73
    iget-object v0, v0, Lli3;->c:Lk03;

    .line 74
    .line 75
    invoke-virtual {v0}, Lad2;->d()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, Ljava/lang/Boolean;

    .line 80
    .line 81
    iget-object p0, p0, Lwk3;->w0:Lyk3;

    .line 82
    .line 83
    if-eqz v0, :cond_4

    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_4

    .line 90
    .line 91
    move v1, v2

    .line 92
    :cond_4
    invoke-virtual {p0, p1, v1}, Lyk3;->q(Ljava/lang/String;Z)V

    .line 93
    .line 94
    .line 95
    :cond_5
    :goto_1
    return-void

    .line 96
    :pswitch_1
    check-cast p1, Lv52;

    .line 97
    .line 98
    iget-boolean p1, p1, Lv52;->a:Z

    .line 99
    .line 100
    if-nez p1, :cond_6

    .line 101
    .line 102
    iget-object p1, p0, Lwk3;->w0:Lyk3;

    .line 103
    .line 104
    new-instance v0, Ljava/util/ArrayList;

    .line 105
    .line 106
    iget-object v1, p0, Lwk3;->x0:Ljava/util/List;

    .line 107
    .line 108
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 109
    .line 110
    .line 111
    iput-object v0, p1, Lyk3;->s:Ljava/util/List;

    .line 112
    .line 113
    invoke-virtual {p1}, Ldw3;->d()V

    .line 114
    .line 115
    .line 116
    :cond_6
    invoke-virtual {p0}, Lwk3;->j0()V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :pswitch_2
    check-cast p1, Ljava/util/List;

    .line 121
    .line 122
    invoke-static {}, Lu52;->c()Lv52;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    iget-boolean v0, v0, Lv52;->a:Z

    .line 127
    .line 128
    if-eqz v0, :cond_7

    .line 129
    .line 130
    iget-object v0, p0, Lwk3;->w0:Lyk3;

    .line 131
    .line 132
    new-instance v1, Ljava/util/ArrayList;

    .line 133
    .line 134
    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 135
    .line 136
    .line 137
    iput-object v1, v0, Lyk3;->s:Ljava/util/List;

    .line 138
    .line 139
    invoke-virtual {v0}, Ldw3;->d()V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0}, Lwk3;->j0()V

    .line 143
    .line 144
    .line 145
    :cond_7
    return-void

    .line 146
    :pswitch_3
    check-cast p1, Ljava/util/List;

    .line 147
    .line 148
    if-eqz p1, :cond_9

    .line 149
    .line 150
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    new-instance v0, Lbi2;

    .line 155
    .line 156
    const/16 v1, 0x1b

    .line 157
    .line 158
    invoke-direct {v0, v1}, Lbi2;-><init>(I)V

    .line 159
    .line 160
    .line 161
    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    check-cast p1, Ljava/util/List;

    .line 174
    .line 175
    iput-object p1, p0, Lwk3;->x0:Ljava/util/List;

    .line 176
    .line 177
    invoke-static {}, Lu52;->c()Lv52;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    iget-boolean p1, p1, Lv52;->a:Z

    .line 182
    .line 183
    if-nez p1, :cond_8

    .line 184
    .line 185
    iget-object p1, p0, Lwk3;->w0:Lyk3;

    .line 186
    .line 187
    new-instance v0, Ljava/util/ArrayList;

    .line 188
    .line 189
    iget-object v1, p0, Lwk3;->x0:Ljava/util/List;

    .line 190
    .line 191
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 192
    .line 193
    .line 194
    iput-object v0, p1, Lyk3;->s:Ljava/util/List;

    .line 195
    .line 196
    invoke-virtual {p1}, Ldw3;->d()V

    .line 197
    .line 198
    .line 199
    :cond_8
    invoke-virtual {p0}, Lwk3;->j0()V

    .line 200
    .line 201
    .line 202
    :cond_9
    return-void

    .line 203
    :pswitch_4
    check-cast p1, Ljava/lang/Long;

    .line 204
    .line 205
    iget-object p0, p0, Lwk3;->w0:Lyk3;

    .line 206
    .line 207
    invoke-virtual {p0}, Ldw3;->d()V

    .line 208
    .line 209
    .line 210
    return-void

    .line 211
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
