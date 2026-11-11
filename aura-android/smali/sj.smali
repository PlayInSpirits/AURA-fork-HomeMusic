.class public final Lsj;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements La83;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Lsj;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lsj;->b:Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;

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
    .locals 6

    .line 1
    iget v0, p0, Lsj;->a:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    const-string v3, "artist"

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    iget-object v5, p0, Lsj;->b:Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p1, Ljava/util/List;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    iget-object v0, v5, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->t0:Lbl2;

    .line 24
    .line 25
    invoke-static {v0, p1, v4, v3}, Lbo2;->q(Lic2;Ljava/util/List;ILjava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, v5, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 29
    .line 30
    iget-object p1, p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 31
    .line 32
    iget-object p1, p1, Lzg5;->n:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p1, Lau;

    .line 35
    .line 36
    invoke-virtual {p1, v2}, Lau;->d(Z)V

    .line 37
    .line 38
    .line 39
    iget-object p1, v5, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->n0:Lwj;

    .line 40
    .line 41
    iget-object v0, p1, Lwj;->c:Lpa;

    .line 42
    .line 43
    iget-object p1, p1, Lwj;->e:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    new-instance v0, Lxi4;

    .line 49
    .line 50
    invoke-direct {v0, v1}, Lxi4;-><init>(I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getId()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    sget-object v1, Lfb0;->n:Lfb0;

    .line 58
    .line 59
    const/16 v2, 0x1e

    .line 60
    .line 61
    invoke-virtual {v0, p1, v1, v2}, Lxi4;->o(Ljava/lang/String;Lfb0;I)Lk03;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p1, p0}, Lad2;->j(La83;)V

    .line 66
    .line 67
    .line 68
    :cond_0
    return-void

    .line 69
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 70
    .line 71
    if-eqz p1, :cond_1

    .line 72
    .line 73
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_1

    .line 78
    .line 79
    iget-object v0, v5, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->t0:Lbl2;

    .line 80
    .line 81
    invoke-static {v0, p1, v4, v3}, Lbo2;->q(Lic2;Ljava/util/List;ILjava/lang/String;)V

    .line 82
    .line 83
    .line 84
    iget-object p1, v5, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 85
    .line 86
    iget-object p1, p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 87
    .line 88
    iget-object p1, p1, Lzg5;->n:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast p1, Lau;

    .line 91
    .line 92
    invoke-virtual {p1, v2}, Lau;->d(Z)V

    .line 93
    .line 94
    .line 95
    iget-object p1, v5, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->n0:Lwj;

    .line 96
    .line 97
    iget-object v0, p1, Lwj;->c:Lpa;

    .line 98
    .line 99
    iget-object p1, p1, Lwj;->e:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    new-instance v2, Lk03;

    .line 105
    .line 106
    invoke-direct {v2}, Lad2;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-static {v4}, Lcom/eddyizm/tempus/App;->f(Z)Lpn4;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    invoke-virtual {v3}, Lpn4;->c()Lgp3;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getId()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    invoke-virtual {v3, v4}, Lgp3;->i(Ljava/lang/String;)Lretrofit2/Call;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    new-instance v4, Lr20;

    .line 126
    .line 127
    invoke-direct {v4, v0, p1, v2, v1}, Lr20;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 128
    .line 129
    .line 130
    invoke-interface {v3, v4}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2, p0}, Lad2;->j(La83;)V

    .line 134
    .line 135
    .line 136
    :cond_1
    return-void

    .line 137
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
