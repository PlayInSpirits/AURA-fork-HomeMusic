.class public final Lex1;
.super Lo15;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public o:I

.field public p:Ljava/lang/Object;

.field public final synthetic q:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(Lo15;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lo15;-><init>(I)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lex1;->q:Ljava/util/Iterator;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 1
    iget v0, p0, Lex1;->o:I

    .line 2
    .line 3
    if-gtz v0, :cond_1

    .line 4
    .line 5
    iget-object p0, p0, Lex1;->q:Ljava/util/Iterator;

    .line 6
    .line 7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lex1;->o:I

    .line 2
    .line 3
    if-gtz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lex1;->q:Ljava/util/Iterator;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lp73;

    .line 12
    .line 13
    iget-object v1, v0, Lp73;->a:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object v1, p0, Lex1;->p:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-virtual {v0}, Lp73;->a()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iput v0, p0, Lex1;->o:I

    .line 22
    .line 23
    :cond_0
    iget v0, p0, Lex1;->o:I

    .line 24
    .line 25
    add-int/lit8 v0, v0, -0x1

    .line 26
    .line 27
    iput v0, p0, Lex1;->o:I

    .line 28
    .line 29
    iget-object p0, p0, Lex1;->p:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    return-object p0
.end method
