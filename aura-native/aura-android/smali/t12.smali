.class public abstract Lt12;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/reflect/AnnotatedElement;
.implements Ljava/lang/reflect/Member;


# instance fields
.field public final n:Ljava/lang/reflect/AccessibleObject;

.field public final o:Ljava/lang/reflect/Member;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    :try_start_0
    const-string v0, "java.lang.reflect.AnnotatedType"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    :catch_0
    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/AccessibleObject;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt12;->n:Ljava/lang/reflect/AccessibleObject;

    .line 5
    .line 6
    check-cast p1, Ljava/lang/reflect/Member;

    .line 7
    .line 8
    iput-object p1, p0, Lt12;->o:Ljava/lang/reflect/Member;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public abstract a()Lcom/google/common/reflect/TypeToken;
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lt12;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lt12;

    .line 6
    .line 7
    invoke-virtual {p0}, Lt12;->a()Lcom/google/common/reflect/TypeToken;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1}, Lt12;->a()Lcom/google/common/reflect/TypeToken;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Lcom/google/common/reflect/TypeToken;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object p0, p0, Lt12;->o:Ljava/lang/reflect/Member;

    .line 22
    .line 23
    iget-object p1, p1, Lt12;->o:Ljava/lang/reflect/Member;

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_0

    .line 30
    .line 31
    const/4 p0, 0x1

    .line 32
    return p0

    .line 33
    :cond_0
    const/4 p0, 0x0

    .line 34
    return p0
.end method

.method public final getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
    .locals 0

    .line 1
    iget-object p0, p0, Lt12;->n:Ljava/lang/reflect/AccessibleObject;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/lang/reflect/AccessibleObject;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getAnnotations()[Ljava/lang/annotation/Annotation;
    .locals 0

    .line 1
    iget-object p0, p0, Lt12;->n:Ljava/lang/reflect/AccessibleObject;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/reflect/AccessibleObject;->getAnnotations()[Ljava/lang/annotation/Annotation;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;
    .locals 0

    .line 1
    iget-object p0, p0, Lt12;->n:Ljava/lang/reflect/AccessibleObject;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/reflect/AccessibleObject;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getDeclaringClass()Ljava/lang/Class;
    .locals 0

    .line 1
    iget-object p0, p0, Lt12;->o:Ljava/lang/reflect/Member;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/lang/reflect/Member;->getDeclaringClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getModifiers()I
    .locals 0

    .line 1
    iget-object p0, p0, Lt12;->o:Ljava/lang/reflect/Member;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/lang/reflect/Member;->getModifiers()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lt12;->o:Ljava/lang/reflect/Member;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lt12;->o:Ljava/lang/reflect/Member;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final isAnnotationPresent(Ljava/lang/Class;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lt12;->n:Ljava/lang/reflect/AccessibleObject;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/lang/reflect/AccessibleObject;->isAnnotationPresent(Ljava/lang/Class;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final isSynthetic()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lt12;->o:Ljava/lang/reflect/Member;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/lang/reflect/Member;->isSynthetic()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
