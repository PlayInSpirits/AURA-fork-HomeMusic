.class public final synthetic Lys1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Landroid/content/Context;

.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:Ljava/util/ArrayList;

.field public final synthetic q:Lcom/eddyizm/tempus/homemusic/SmartOut;

.field public final synthetic r:Ljava/util/List;

.field public final synthetic s:Ljava/lang/String;

.field public final synthetic t:I


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/util/ArrayList;Lcom/eddyizm/tempus/homemusic/SmartOut;Ljava/util/List;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lys1;->n:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lys1;->o:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lys1;->p:Ljava/util/ArrayList;

    .line 9
    .line 10
    iput-object p4, p0, Lys1;->q:Lcom/eddyizm/tempus/homemusic/SmartOut;

    .line 11
    .line 12
    iput-object p5, p0, Lys1;->r:Ljava/util/List;

    .line 13
    .line 14
    iput-object p6, p0, Lys1;->s:Ljava/lang/String;

    .line 15
    .line 16
    iput p7, p0, Lys1;->t:I

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, Lys1;->t:I

    .line 2
    .line 3
    add-int/lit8 v7, v0, 0x1

    .line 4
    .line 5
    iget-object v1, p0, Lys1;->n:Landroid/content/Context;

    .line 6
    .line 7
    iget-object v2, p0, Lys1;->o:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v3, p0, Lys1;->p:Ljava/util/ArrayList;

    .line 10
    .line 11
    iget-object v4, p0, Lys1;->q:Lcom/eddyizm/tempus/homemusic/SmartOut;

    .line 12
    .line 13
    iget-object v5, p0, Lys1;->r:Ljava/util/List;

    .line 14
    .line 15
    iget-object v6, p0, Lys1;->s:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static/range {v1 .. v7}, Lcom/eddyizm/tempus/homemusic/a;->k(Landroid/content/Context;Ljava/lang/String;Ljava/util/ArrayList;Lcom/eddyizm/tempus/homemusic/SmartOut;Ljava/util/List;Ljava/lang/String;I)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
