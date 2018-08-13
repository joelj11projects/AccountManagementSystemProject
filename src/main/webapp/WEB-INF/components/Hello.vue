<template>
    <div class="hello">
        <h1>{{ msg }} </h1>
        <h2>Essential Links</h2>
        <ul>
            <li>hi</li>
            <li>hello</li>
            <li>olla</li>
            <li>byee</li>
        </ul>
        <h2>second header</h2>

    </div>
</template>

<script>
export default {
    name: 'hello',
    data () {
        return {
            msg: 'Welcome to my vue'
        }
    }
}
</script>

<style scoped>
h1, h2 {
    font-weight: normal;
}

ul {
    list-style-type: none;
    padding: 0;
}

li {
    display:inline-block;
    margin: 0 10px;
}

a {
    color: #42b983;
}




</style>