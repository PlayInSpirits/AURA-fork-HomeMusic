.class public final synthetic Lek3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lhk3;

.field public final synthetic p:Lcom/eddyizm/tempus/subsonic/models/Child;


# direct methods
.method public synthetic constructor <init>(Lhk3;Lcom/eddyizm/tempus/subsonic/models/Child;I)V
    .locals 0

    .line 1
    iput p3, p0, Lek3;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lek3;->o:Lhk3;

    .line 4
    .line 5
    iput-object p2, p0, Lek3;->p:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    .line 1
    iget p1, p0, Lek3;->n:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    iget-object v2, p0, Lek3;->p:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 6
    .line 7
    iget-object p0, p0, Lek3;->o:Lhk3;

    .line 8
    .line 9
    packed-switch p1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lhk3;->m0:Laj3;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v3, p1, Laj3;->q:Lk03;

    .line 21
    .line 22
    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 23
    .line 24
    invoke-virtual {v3, v4}, Lad2;->k(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p1, Laj3;->c:Lxi4;

    .line 28
    .line 29
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    sget-object v4, Lfb0;->p:Lfb0;

    .line 34
    .line 35
    const/16 v5, 0x14

    .line 36
    .line 37
    invoke-virtual {p1, v2, v4, v5}, Lxi4;->o(Ljava/lang/String;Lfb0;I)Lk03;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    new-instance v2, Lg7;

    .line 42
    .line 43
    invoke-direct {v2, v3, v1}, Lg7;-><init>(Lk03;I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v0, v2}, Lad2;->e(Lba2;La83;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    new-instance v0, Ldk3;

    .line 54
    .line 55
    const/4 v1, 0x2

    .line 56
    invoke-direct {v0, p0, v1}, Ldk3;-><init>(Lhk3;I)V

    .line 57
    .line 58
    .line 59
    new-instance p0, Lht1;

    .line 60
    .line 61
    const/4 v1, 0x1

    .line 62
    invoke-direct {p0, v0, v1}, Lht1;-><init>(Lif1;I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3, p1, p0}, Lad2;->e(Lba2;La83;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_0
    const-string p0, "playerBottomSheetViewModel"

    .line 70
    .line 71
    invoke-static {p0}, Lh12;->Q(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw v0

    .line 75
    :pswitch_0
    new-instance p1, Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    new-instance v1, Landroid/os/Bundle;

    .line 84
    .line 85
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 86
    .line 87
    .line 88
    const-string v2, "TRACKS_OBJECT"

    .line 89
    .line 90
    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 91
    .line 92
    .line 93
    new-instance p1, Lfl3;

    .line 94
    .line 95
    invoke-direct {p1}, Lfl3;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, v1}, Lkc1;->c0(Landroid/os/Bundle;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-virtual {p0}, Lnc1;->k()Lmd1;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-virtual {p1, p0, v0}, Lpp0;->m0(Lld1;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :pswitch_1
    invoke-static {}, Lud3;->o()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    if-nez p1, :cond_1

    .line 118
    .line 119
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-static {p0}, Lau0;->w(Landroid/content/Context;)Leu0;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-static {v2}, Lgi1;->G(Lcom/eddyizm/tempus/subsonic/models/Child;)Lgn2;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    new-instance v0, Lcom/eddyizm/tempus/model/Download;

    .line 132
    .line 133
    invoke-direct {v0, v2}, Lcom/eddyizm/tempus/model/Download;-><init>(Lcom/eddyizm/tempus/subsonic/models/Child;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0, p1, v0, v1}, Leu0;->b(Lgn2;Lcom/eddyizm/tempus/model/Download;Z)Z

    .line 137
    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_1
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    invoke-static {p0, v2}, Li51;->a(Landroid/content/Context;Lcom/eddyizm/tempus/subsonic/models/Child;)V

    .line 145
    .line 146
    .line 147
    :goto_0
    return-void

    .line 148
    nop

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
