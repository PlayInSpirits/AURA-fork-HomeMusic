.class public final synthetic Ldefpackage/ri4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/a83;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Ldefpackage/ri4;->a:I

    .line 2
    .line 3
    iput-object p3, p0, Ldefpackage/ri4;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput p1, p0, Ldefpackage/ri4;->c:I

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
    .locals 3

    .line 1
    iget v0, p0, Ldefpackage/ri4;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget v2, p0, Ldefpackage/ri4;->c:I

    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/ri4;->b:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, Lcom/eddyizm/tempus/viewmodel/b;

    .line 12
    .line 13
    check-cast p1, Ljava/util/List;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget v0, p0, Lcom/eddyizm/tempus/viewmodel/b;->F:I

    .line 18
    .line 19
    if-ne v2, v0, :cond_0

    .line 20
    .line 21
    new-instance v0, Ldefpackage/m7;

    .line 22
    .line 23
    const/16 v2, 0x8

    .line 24
    .line 25
    invoke-direct {v0, v2}, Ldefpackage/m7;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-static {}, Ljava/util/Comparator;->naturalOrder()Ljava/util/Comparator;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-static {v2}, Ljava/util/Comparator;->nullsFirst(Ljava/util/Comparator;)Ljava/util/Comparator;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-static {v0, v2}, Ljava/util/Comparator;->comparing(Ljava/util/function/Function;Ljava/util/Comparator;)Ljava/util/Comparator;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {v0}, Ljava/util/Comparator;->reversed()Ljava/util/Comparator;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-interface {p1, v0}, Ljava/util/List;->sort(Ljava/util/Comparator;)V

    .line 45
    .line 46
    .line 47
    iget-object p0, p0, Lcom/eddyizm/tempus/viewmodel/b;->m:Ldefpackage/k03;

    .line 48
    .line 49
    const/16 v0, 0x14

    .line 50
    .line 51
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    invoke-interface {p1, v1, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p0, p1}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    :cond_0
    return-void

    .line 67
    :pswitch_0
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;

    .line 68
    .line 69
    check-cast p1, Ljava/util/List;

    .line 70
    .line 71
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->l0:Ldefpackage/up0;

    .line 72
    .line 73
    if-eqz v0, :cond_2

    .line 74
    .line 75
    iget v0, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->s0:I

    .line 76
    .line 77
    if-eq v2, v0, :cond_1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_1
    iput-boolean v1, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->r0:Z

    .line 81
    .line 82
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->p0:Ldefpackage/ni4;

    .line 83
    .line 84
    invoke-virtual {v0, p1}, Ldefpackage/ni4;->r(Ljava/util/List;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->j0()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->k0(Ljava/util/List;)V

    .line 91
    .line 92
    .line 93
    :cond_2
    :goto_0
    return-void

    .line 94
    :pswitch_1
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;

    .line 95
    .line 96
    check-cast p1, Ljava/util/List;

    .line 97
    .line 98
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->l0:Ldefpackage/up0;

    .line 99
    .line 100
    if-eqz v0, :cond_4

    .line 101
    .line 102
    iget v0, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->s0:I

    .line 103
    .line 104
    if-eq v2, v0, :cond_3

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_3
    iput-boolean v1, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->r0:Z

    .line 108
    .line 109
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->p0:Ldefpackage/ni4;

    .line 110
    .line 111
    invoke-virtual {v0, p1}, Ldefpackage/ni4;->r(Ljava/util/List;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->j0()V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->k0(Ljava/util/List;)V

    .line 118
    .line 119
    .line 120
    :cond_4
    :goto_1
    return-void

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
