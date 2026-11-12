.class public final Lxs0;
.super Lv83;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;


# direct methods
.method public constructor <init>(Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxs0;->e:Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;

    .line 2
    .line 3
    iput p2, p0, Lxs0;->d:I

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lv83;-><init>(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget v0, p0, Lxs0;->d:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, Lxs0;->e:Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;

    .line 5
    .line 6
    if-le v0, v1, :cond_0

    .line 7
    .line 8
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->o0:Lbu0;

    .line 9
    .line 10
    iget-object v0, v0, Lbu0;->e:Lk03;

    .line 11
    .line 12
    invoke-virtual {v0}, Lad2;->d()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    sub-int/2addr v3, v1

    .line 23
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v2}, Lad2;->k(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 31
    .line 32
    iget-object v0, v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Lv23;

    .line 33
    .line 34
    invoke-virtual {v0}, Lv23;->o()V

    .line 35
    .line 36
    .line 37
    :goto_0
    invoke-virtual {p0}, Lv83;->b()V

    .line 38
    .line 39
    .line 40
    return-void
.end method
