.class public final synthetic Lsi4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Lsi4;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lsi4;->o:Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget v0, p0, Lsi4;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Lsi4;->o:Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->p0:Lni4;

    .line 9
    .line 10
    iget-object v0, v0, Lni4;->u:Ljava/util/List;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->k0(Ljava/util/List;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->i0()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
