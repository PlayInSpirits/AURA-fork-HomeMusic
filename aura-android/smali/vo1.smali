.class public final synthetic Lvo1;
.super Lig1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lgf1;


# instance fields
.field public final synthetic n:Lrm3;

.field public final synthetic o:Lcom/google/android/material/appbar/MaterialToolbar;

.field public final synthetic p:Lcom/google/android/material/appbar/MaterialToolbar;

.field public final synthetic q:Lbd1;

.field public final synthetic r:Landroid/content/Context;

.field public final synthetic s:Z

.field public final synthetic t:Lni4;


# direct methods
.method public constructor <init>(Lrm3;Lcom/google/android/material/appbar/MaterialToolbar;Lcom/google/android/material/appbar/MaterialToolbar;Lbd1;Landroid/content/Context;ZLni4;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lvo1;->n:Lrm3;

    .line 2
    .line 3
    iput-object p2, p0, Lvo1;->o:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 4
    .line 5
    iput-object p3, p0, Lvo1;->p:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 6
    .line 7
    iput-object p4, p0, Lvo1;->q:Lbd1;

    .line 8
    .line 9
    iput-object p5, p0, Lvo1;->r:Landroid/content/Context;

    .line 10
    .line 11
    iput-boolean p6, p0, Lvo1;->s:Z

    .line 12
    .line 13
    iput-object p7, p0, Lvo1;->t:Lni4;

    .line 14
    .line 15
    const-string p4, "attach$refresh(Lcom/eddyizm/tempus/homemusic/SongSelection;Lcom/google/android/material/appbar/MaterialToolbar;Lcom/google/android/material/appbar/MaterialToolbar;Lcom/eddyizm/tempus/homemusic/HomeSongSelection$attach$back$1;Landroid/content/Context;ZLcom/eddyizm/tempus/ui/adapter/SongHorizontalAdapter;)V"

    .line 16
    .line 17
    const/4 p5, 0x0

    .line 18
    const/4 p1, 0x0

    .line 19
    const-class p2, Lg12;

    .line 20
    .line 21
    const-string p3, "refresh"

    .line 22
    .line 23
    invoke-direct/range {p0 .. p5}, Lig1;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 24
    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-boolean v5, p0, Lvo1;->s:Z

    .line 2
    .line 3
    iget-object v6, p0, Lvo1;->t:Lni4;

    .line 4
    .line 5
    iget-object v0, p0, Lvo1;->n:Lrm3;

    .line 6
    .line 7
    iget-object v1, p0, Lvo1;->o:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 8
    .line 9
    iget-object v2, p0, Lvo1;->p:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 10
    .line 11
    iget-object v3, p0, Lvo1;->q:Lbd1;

    .line 12
    .line 13
    iget-object v4, p0, Lvo1;->r:Landroid/content/Context;

    .line 14
    .line 15
    invoke-static/range {v0 .. v6}, Ljz4;->h(Lrm3;Lcom/google/android/material/appbar/MaterialToolbar;Lcom/google/android/material/appbar/MaterialToolbar;Lbd1;Landroid/content/Context;ZLni4;)V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lj15;->a:Lj15;

    .line 19
    .line 20
    return-object p0
.end method
