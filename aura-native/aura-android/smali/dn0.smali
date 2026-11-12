.class public final synthetic Ldn0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic n:Lpn0;

.field public final synthetic o:Ljn0;

.field public final synthetic p:Z

.field public final synthetic q:[I


# direct methods
.method public synthetic constructor <init>(Lpn0;Ljn0;Z[I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldn0;->n:Lpn0;

    .line 5
    .line 6
    iput-object p2, p0, Ldn0;->o:Ljn0;

    .line 7
    .line 8
    iput-boolean p3, p0, Ldn0;->p:Z

    .line 9
    .line 10
    iput-object p4, p0, Ldn0;->q:[I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final g(ILsv4;[I)Lgy3;
    .locals 10

    .line 1
    iget-object v0, p0, Ldn0;->n:Lpn0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v8, Len0;

    .line 7
    .line 8
    iget-object v5, p0, Ldn0;->o:Ljn0;

    .line 9
    .line 10
    invoke-direct {v8, v0, v5}, Len0;-><init>(Lpn0;Ljn0;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Ldn0;->q:[I

    .line 14
    .line 15
    aget v9, v0, p1

    .line 16
    .line 17
    invoke-static {}, Lyw1;->j()Luw1;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v1, 0x0

    .line 22
    move v4, v1

    .line 23
    :goto_0
    iget v1, p2, Lsv4;->a:I

    .line 24
    .line 25
    if-ge v4, v1, :cond_0

    .line 26
    .line 27
    new-instance v1, Lfn0;

    .line 28
    .line 29
    aget v6, p3, v4

    .line 30
    .line 31
    iget-boolean v7, p0, Ldn0;->p:Z

    .line 32
    .line 33
    move v2, p1

    .line 34
    move-object v3, p2

    .line 35
    invoke-direct/range {v1 .. v9}, Lfn0;-><init>(ILsv4;ILjn0;IZLen0;I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Lpw1;->c(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    add-int/lit8 v4, v4, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-virtual {v0}, Luw1;->f()Lgy3;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0
.end method
