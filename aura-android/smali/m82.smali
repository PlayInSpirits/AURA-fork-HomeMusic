.class public final synthetic Lm82;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwf1;


# instance fields
.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:I

.field public final synthetic p:Ln82;

.field public final synthetic q:Lr70;

.field public final synthetic r:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILn82;Lr70;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm82;->n:Ljava/lang/Object;

    .line 5
    .line 6
    iput p2, p0, Lm82;->o:I

    .line 7
    .line 8
    iput-object p3, p0, Lm82;->p:Ln82;

    .line 9
    .line 10
    iput-object p4, p0, Lm82;->q:Lr70;

    .line 11
    .line 12
    iput p5, p0, Lm82;->r:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    move-object v4, p1

    .line 2
    check-cast v4, Lrg1;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lm82;->r:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Lxl;->O(I)I

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    iget-object v0, p0, Lm82;->n:Ljava/lang/Object;

    .line 18
    .line 19
    iget v1, p0, Lm82;->o:I

    .line 20
    .line 21
    iget-object v2, p0, Lm82;->p:Ln82;

    .line 22
    .line 23
    iget-object v3, p0, Lm82;->q:Lr70;

    .line 24
    .line 25
    invoke-static/range {v0 .. v5}, Ljz4;->b(Ljava/lang/Object;ILn82;Lr70;Lrg1;I)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lj15;->a:Lj15;

    .line 29
    .line 30
    return-object p0
.end method
