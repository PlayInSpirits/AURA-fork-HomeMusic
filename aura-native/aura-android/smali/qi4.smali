.class public final synthetic Lqi4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqi4;->a:Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;

    .line 5
    .line 6
    iput p2, p0, Lqi4;->b:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    iget-object v0, p0, Lqi4;->a:Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;

    .line 4
    .line 5
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->l0:Lup0;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    iget v1, v0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->s0:I

    .line 10
    .line 11
    iget p0, p0, Lqi4;->b:I

    .line 12
    .line 13
    if-eq p0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    iput-boolean p0, v0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->r0:Z

    .line 18
    .line 19
    iget-object p0, v0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->p0:Lni4;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lni4;->r(Ljava/util/List;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->j0()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1}, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->k0(Ljava/util/List;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    :goto_0
    return-void
.end method
