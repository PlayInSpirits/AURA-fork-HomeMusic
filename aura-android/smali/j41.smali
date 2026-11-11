.class public final synthetic Lj41;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lc55;


# instance fields
.field public final synthetic n:Lq41;

.field public final synthetic o:Lc55;


# direct methods
.method public synthetic constructor <init>(Lq41;Lc55;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj41;->n:Lq41;

    .line 5
    .line 6
    iput-object p2, p0, Lj41;->o:Lc55;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final d(JJLtb1;Landroid/media/MediaFormat;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lj41;->o:Lc55;

    .line 2
    .line 3
    move-wide v1, p1

    .line 4
    move-wide v3, p3

    .line 5
    move-object v5, p5

    .line 6
    move-object v6, p6

    .line 7
    invoke-interface/range {v0 .. v6}, Lc55;->d(JJLtb1;Landroid/media/MediaFormat;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lj41;->n:Lq41;

    .line 11
    .line 12
    invoke-virtual/range {p0 .. p6}, Lq41;->d(JJLtb1;Landroid/media/MediaFormat;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
