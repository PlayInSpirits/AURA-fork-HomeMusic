.class public final Lnz4;
.super Loz4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic o:Ljava/lang/reflect/TypeVariable;

.field public final synthetic p:Loz4;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/TypeVariable;Loz4;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lnz4;->o:Ljava/lang/reflect/TypeVariable;

    .line 2
    .line 3
    iput-object p2, p0, Lnz4;->p:Loz4;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Loz4;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/reflect/TypeVariable;Lnz4;)Ljava/lang/reflect/Type;
    .locals 2

    .line 1
    invoke-interface {p1}, Ljava/lang/reflect/TypeVariable;->getGenericDeclaration()Ljava/lang/reflect/GenericDeclaration;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lnz4;->o:Ljava/lang/reflect/TypeVariable;

    .line 6
    .line 7
    invoke-interface {v1}, Ljava/lang/reflect/TypeVariable;->getGenericDeclaration()Ljava/lang/reflect/GenericDeclaration;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    iget-object p0, p0, Lnz4;->p:Loz4;

    .line 19
    .line 20
    invoke-virtual {p0, p1, p2}, Loz4;->a(Ljava/lang/reflect/TypeVariable;Lnz4;)Ljava/lang/reflect/Type;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method
