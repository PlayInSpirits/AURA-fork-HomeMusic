.class public final Lqq0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lcom/eddyizm/tempus/interfaces/DialogClickCallback;


# instance fields
.field public final synthetic n:Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;


# direct methods
.method public constructor <init>(Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqq0;->n:Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onPositiveClick()V
    .locals 4

    .line 1
    iget-object v0, p0, Lqq0;->n:Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;->n0:Lrq0;

    .line 4
    .line 5
    iget-object v2, v0, Lkc1;->s:Landroid/os/Bundle;

    .line 6
    .line 7
    const-string v3, "MUSIC_DIRECTORY_ID"

    .line 8
    .line 9
    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-object v1, v1, Lrq0;->c:Lom0;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {v2}, Lom0;->W(Ljava/lang/String;)Lk03;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0}, Lkc1;->v()Lle1;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v2, Ld8;

    .line 27
    .line 28
    const/16 v3, 0x8

    .line 29
    .line 30
    invoke-direct {v2, v3, p0}, Ld8;-><init>(ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v0, v2}, Lad2;->e(Lba2;La83;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method
