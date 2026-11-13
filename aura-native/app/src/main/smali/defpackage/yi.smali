.class public final Ldefpackage/yi;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/a83;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ldefpackage/t6;

.field public final synthetic c:Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;Ldefpackage/t6;I)V
    .locals 0

    .line 1
    iput p3, p0, Ldefpackage/yi;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/yi;->c:Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;

    .line 4
    .line 5
    iput-object p2, p0, Ldefpackage/yi;->b:Ldefpackage/t6;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget v0, p0, Ldefpackage/yi;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, Ldefpackage/yi;->c:Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;

    .line 5
    .line 6
    iget-object v3, p0, Ldefpackage/yi;->b:Ldefpackage/t6;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, Ljava/util/List;

    .line 12
    .line 13
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;->B0:Ldefpackage/bj;

    .line 14
    .line 15
    invoke-virtual {v0}, Ldefpackage/bj;->c()Ldefpackage/ad2;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0, p0}, Ldefpackage/ad2;->j(Ldefpackage/a83;)V

    .line 20
    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-eqz p0, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance p0, Landroid/os/Bundle;

    .line 32
    .line 33
    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    .line 34
    .line 35
    .line 36
    const-string v0, "TRACKS_OBJECT"

    .line 37
    .line 38
    new-instance v1, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 44
    .line 45
    .line 46
    new-instance p1, Ldefpackage/fl3;

    .line 47
    .line 48
    invoke-direct {p1}, Ldefpackage/fl3;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, p0}, Ldefpackage/kc1;->c0(Landroid/os/Bundle;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {p0}, Ldefpackage/nc1;->k()Ldefpackage/md1;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    const/4 v0, 0x0

    .line 63
    invoke-virtual {p1, p0, v0}, Ldefpackage/pp0;->m0(Ldefpackage/ld1;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2}, Ldefpackage/zt;->h0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    .line 68
    .line 69
    :cond_1
    :goto_0
    invoke-virtual {v3}, Ldefpackage/t6;->run()V

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :catchall_0
    move-exception p0

    .line 74
    invoke-virtual {v3}, Ldefpackage/t6;->run()V

    .line 75
    .line 76
    .line 77
    throw p0

    .line 78
    :goto_1
    return-void

    .line 79
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 80
    .line 81
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;->B0:Ldefpackage/bj;

    .line 82
    .line 83
    invoke-virtual {v0}, Ldefpackage/bj;->c()Ldefpackage/ad2;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0, p0}, Ldefpackage/ad2;->j(Ldefpackage/a83;)V

    .line 88
    .line 89
    .line 90
    if-eqz p1, :cond_3

    .line 91
    .line 92
    :try_start_1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    if-eqz p0, :cond_2

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_2
    invoke-static {p1}, Ldefpackage/e03;->o(Ljava/util/List;)V

    .line 100
    .line 101
    .line 102
    iget-object p0, v2, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;->D0:Ldefpackage/bl2;

    .line 103
    .line 104
    const/4 v0, 0x0

    .line 105
    invoke-static {p0, p1, v0}, Ldefpackage/bo2;->e(Ldefpackage/ic2;Ljava/util/List;Z)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    check-cast p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 113
    .line 114
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Ldefpackage/zg5;

    .line 115
    .line 116
    iget-object p0, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast p0, Ldefpackage/au;

    .line 119
    .line 120
    invoke-virtual {p0, v1}, Ldefpackage/au;->d(Z)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2}, Ldefpackage/zt;->h0()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 124
    .line 125
    .line 126
    :cond_3
    :goto_2
    invoke-virtual {v3}, Ldefpackage/t6;->run()V

    .line 127
    .line 128
    .line 129
    goto :goto_3

    .line 130
    :catchall_1
    move-exception p0

    .line 131
    invoke-virtual {v3}, Ldefpackage/t6;->run()V

    .line 132
    .line 133
    .line 134
    throw p0

    .line 135
    :goto_3
    return-void

    .line 136
    :pswitch_1
    check-cast p1, Ljava/util/List;

    .line 137
    .line 138
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;->B0:Ldefpackage/bj;

    .line 139
    .line 140
    invoke-virtual {v0}, Ldefpackage/bj;->c()Ldefpackage/ad2;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {v0, p0}, Ldefpackage/ad2;->j(Ldefpackage/a83;)V

    .line 145
    .line 146
    .line 147
    if-eqz p1, :cond_5

    .line 148
    .line 149
    :try_start_2
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 150
    .line 151
    .line 152
    move-result p0

    .line 153
    if-eqz p0, :cond_4

    .line 154
    .line 155
    goto :goto_4

    .line 156
    :cond_4
    invoke-static {p1}, Ldefpackage/e03;->o(Ljava/util/List;)V

    .line 157
    .line 158
    .line 159
    iget-object p0, v2, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;->D0:Ldefpackage/bl2;

    .line 160
    .line 161
    invoke-static {p0, p1, v1}, Ldefpackage/bo2;->e(Ldefpackage/ic2;Ljava/util/List;Z)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    check-cast p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 169
    .line 170
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Ldefpackage/zg5;

    .line 171
    .line 172
    iget-object p0, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast p0, Ldefpackage/au;

    .line 175
    .line 176
    invoke-virtual {p0, v1}, Ldefpackage/au;->d(Z)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2}, Ldefpackage/zt;->h0()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 180
    .line 181
    .line 182
    :cond_5
    :goto_4
    invoke-virtual {v3}, Ldefpackage/t6;->run()V

    .line 183
    .line 184
    .line 185
    goto :goto_5

    .line 186
    :catchall_2
    move-exception p0

    .line 187
    invoke-virtual {v3}, Ldefpackage/t6;->run()V

    .line 188
    .line 189
    .line 190
    throw p0

    .line 191
    :goto_5
    return-void

    .line 192
    nop

    .line 193
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
