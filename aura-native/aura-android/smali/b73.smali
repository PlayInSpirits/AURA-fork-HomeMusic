.class public final synthetic Lb73;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwf1;


# instance fields
.field public final synthetic n:Ljava/util/List;

.field public final synthetic o:I

.field public final synthetic p:Z

.field public final synthetic q:Landroid/net/Uri;

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:Z

.field public final synthetic t:Z

.field public final synthetic u:Lif1;

.field public final synthetic v:Lgf1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;IZLandroid/net/Uri;Ljava/lang/String;ZZLif1;Lgf1;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb73;->n:Ljava/util/List;

    .line 5
    .line 6
    iput p2, p0, Lb73;->o:I

    .line 7
    .line 8
    iput-boolean p3, p0, Lb73;->p:Z

    .line 9
    .line 10
    iput-object p4, p0, Lb73;->q:Landroid/net/Uri;

    .line 11
    .line 12
    iput-object p5, p0, Lb73;->r:Ljava/lang/String;

    .line 13
    .line 14
    iput-boolean p6, p0, Lb73;->s:Z

    .line 15
    .line 16
    iput-boolean p7, p0, Lb73;->t:Z

    .line 17
    .line 18
    iput-object p8, p0, Lb73;->u:Lif1;

    .line 19
    .line 20
    iput-object p9, p0, Lb73;->v:Lgf1;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    move-object v9, p1

    .line 2
    check-cast v9, Lrg1;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-static {p1}, Lxl;->O(I)I

    .line 11
    .line 12
    .line 13
    move-result v10

    .line 14
    iget-object v0, p0, Lb73;->n:Ljava/util/List;

    .line 15
    .line 16
    iget v1, p0, Lb73;->o:I

    .line 17
    .line 18
    iget-boolean v2, p0, Lb73;->p:Z

    .line 19
    .line 20
    iget-object v3, p0, Lb73;->q:Landroid/net/Uri;

    .line 21
    .line 22
    iget-object v4, p0, Lb73;->r:Ljava/lang/String;

    .line 23
    .line 24
    iget-boolean v5, p0, Lb73;->s:Z

    .line 25
    .line 26
    iget-boolean v6, p0, Lb73;->t:Z

    .line 27
    .line 28
    iget-object v7, p0, Lb73;->u:Lif1;

    .line 29
    .line 30
    iget-object v8, p0, Lb73;->v:Lgf1;

    .line 31
    .line 32
    invoke-static/range {v0 .. v10}, Le35;->e(Ljava/util/List;IZLandroid/net/Uri;Ljava/lang/String;ZZLif1;Lgf1;Lrg1;I)V

    .line 33
    .line 34
    .line 35
    sget-object p0, Lj15;->a:Lj15;

    .line 36
    .line 37
    return-object p0
.end method
