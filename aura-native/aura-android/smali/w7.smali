.class public final Lw7;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/widget/SearchView$OnQueryTextListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/widget/SearchView;

.field public final synthetic c:Lkc1;


# direct methods
.method public synthetic constructor <init>(Lkc1;Landroid/widget/SearchView;I)V
    .locals 0

    .line 1
    iput p3, p0, Lw7;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lw7;->c:Lkc1;

    .line 4
    .line 5
    iput-object p2, p0, Lw7;->b:Landroid/widget/SearchView;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onQueryTextChange(Ljava/lang/String;)Z
    .locals 3

    .line 1
    iget v0, p0, Lw7;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Lw7;->c:Lkc1;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;

    .line 10
    .line 11
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->p0:Lni4;

    .line 12
    .line 13
    iget-object p0, p0, Lni4;->C:Lo7;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Landroid/widget/Filter;->filter(Ljava/lang/CharSequence;)V

    .line 16
    .line 17
    .line 18
    return v1

    .line 19
    :pswitch_0
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelCatalogueFragment;

    .line 20
    .line 21
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelCatalogueFragment;->o0:Lej;

    .line 22
    .line 23
    iget-object p0, p0, Lej;->u:Landroid/widget/Filter;

    .line 24
    .line 25
    check-cast p0, Lo7;

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Landroid/widget/Filter;->filter(Ljava/lang/CharSequence;)V

    .line 28
    .line 29
    .line 30
    return v1

    .line 31
    :pswitch_1
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;

    .line 32
    .line 33
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->p0:Lni4;

    .line 34
    .line 35
    iget-object p0, p0, Lni4;->C:Lo7;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Landroid/widget/Filter;->filter(Ljava/lang/CharSequence;)V

    .line 38
    .line 39
    .line 40
    return v1

    .line 41
    :pswitch_2
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistCatalogueFragment;

    .line 42
    .line 43
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistCatalogueFragment;->o0:Lq7;

    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    new-instance v0, Lo7;

    .line 49
    .line 50
    const/4 v2, 0x6

    .line 51
    invoke-direct {v0, p0, v2}, Lo7;-><init>(Ldw3;I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, p1}, Landroid/widget/Filter;->filter(Ljava/lang/CharSequence;)V

    .line 55
    .line 56
    .line 57
    return v1

    .line 58
    :pswitch_3
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;

    .line 59
    .line 60
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;->o0:Lej;

    .line 61
    .line 62
    iget-object p0, p0, Lej;->u:Landroid/widget/Filter;

    .line 63
    .line 64
    check-cast p0, Lo7;

    .line 65
    .line 66
    invoke-virtual {p0, p1}, Landroid/widget/Filter;->filter(Ljava/lang/CharSequence;)V

    .line 67
    .line 68
    .line 69
    const/4 p0, 0x1

    .line 70
    return p0

    .line 71
    :pswitch_4
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;

    .line 72
    .line 73
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;->o0:Lb8;

    .line 74
    .line 75
    iget-object p0, p0, Lb8;->v:Landroid/widget/Filter;

    .line 76
    .line 77
    check-cast p0, Lo7;

    .line 78
    .line 79
    invoke-virtual {p0, p1}, Landroid/widget/Filter;->filter(Ljava/lang/CharSequence;)V

    .line 80
    .line 81
    .line 82
    return v1

    .line 83
    :pswitch_5
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;

    .line 84
    .line 85
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->q0:Lq7;

    .line 86
    .line 87
    iget-object p0, p0, Lq7;->v:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p0, Lo7;

    .line 90
    .line 91
    invoke-virtual {p0, p1}, Landroid/widget/Filter;->filter(Ljava/lang/CharSequence;)V

    .line 92
    .line 93
    .line 94
    return v1

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onQueryTextSubmit(Ljava/lang/String;)Z
    .locals 3

    .line 1
    iget v0, p0, Lw7;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lw7;->b:Landroid/widget/SearchView;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v2}, Landroid/widget/SearchView;->clearFocus()V

    .line 10
    .line 11
    .line 12
    return v1

    .line 13
    :pswitch_0
    invoke-virtual {v2}, Landroid/widget/SearchView;->clearFocus()V

    .line 14
    .line 15
    .line 16
    return v1

    .line 17
    :pswitch_1
    invoke-virtual {v2}, Landroid/widget/SearchView;->clearFocus()V

    .line 18
    .line 19
    .line 20
    return v1

    .line 21
    :pswitch_2
    invoke-virtual {v2}, Landroid/widget/SearchView;->clearFocus()V

    .line 22
    .line 23
    .line 24
    return v1

    .line 25
    :pswitch_3
    iget-object p0, p0, Lw7;->c:Lkc1;

    .line 26
    .line 27
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;

    .line 28
    .line 29
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;->o0:Lej;

    .line 30
    .line 31
    iget-object p0, p0, Lej;->u:Landroid/widget/Filter;

    .line 32
    .line 33
    check-cast p0, Lo7;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Landroid/widget/Filter;->filter(Ljava/lang/CharSequence;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Landroid/widget/SearchView;->clearFocus()V

    .line 39
    .line 40
    .line 41
    const/4 p0, 0x1

    .line 42
    return p0

    .line 43
    :pswitch_4
    invoke-virtual {v2}, Landroid/widget/SearchView;->clearFocus()V

    .line 44
    .line 45
    .line 46
    return v1

    .line 47
    :pswitch_5
    invoke-virtual {v2}, Landroid/widget/SearchView;->clearFocus()V

    .line 48
    .line 49
    .line 50
    return v1

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
